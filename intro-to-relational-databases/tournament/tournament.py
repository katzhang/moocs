#!/usr/bin/env python
# 
# tournament.py -- implementation of a Swiss-system tournament
#

import psycopg2


def connect():
    """Connect to the PostgreSQL database.  Returns a database connection."""
    return psycopg2.connect("dbname=tournament")

def deleteMatches():
    """Remove all the match records from the database."""
    connection = connect()
    cursor = connection.cursor()
    query = "DELETE FROM Matches"
    cursor.execute(query)
    connection.commit()
    connection.close()


def deletePlayers():
    """Remove all the player records from the database."""
    connection = connect()
    cursor = connection.cursor()
    query = "DELETE FROM Players"
    cursor.execute(query)
    connection.commit()
    connection.close()


def countPlayers():
    """Returns the number of players currently registered."""
    connection = connect()
    cursor = connection.cursor()
    query = "SELECT count(*) as number FROM Players"
    cursor.execute(query)
    playerNumber = cursor.fetchone()[0]
    connection.close()
    return playerNumber


def registerPlayer(name):
    """Adds a player to the tournament database.
  
    The database assigns a unique serial id number for the player.  (This
    should be handled by your SQL database schema, not in your Python code.)
  
    Args:
      name: the player's full name (need not be unique).
    """
    connection = connect()
    cursor = connection.cursor()
    query = "INSERT INTO Players VALUES (%s)"
    cursor.execute("INSERT INTO Players VALUES (%s)", (name,))
    connection.commit()
    connection.close()


def playerStandings():
    """Returns a list of the players and their win records, sorted by wins.

    The first entry in the list should be the player in first place, or a player
    tied for first place if there is currently a tie.

    Returns:
      A list of tuples, each of which contains (id, name, wins, matches):
        id: the player's unique id (assigned by the database)
        name: the player's full name (as registered)
        wins: the number of matches the player has won
        matches: the number of matches the player has played
    """
    connection = connect()
    cursor = connection.cursor()
    query = "SELECT Players.playerid, Players.name, WinsCount.num as wins, MatchesCount.num as matches FROM Players, WinsCount, MatchesCount WHERE Players.playerid = WinsCount.playerid AND WinsCount.playerid = MatchesCount.playerid ORDER BY wins"
    cursor.execute(query)
    players = [(str(row[0]), str(row[1]), row[2], row[3]) for row in cursor.fetchall()]
    connection.close()
    return players

def reportMatch(winner, loser):
    """Records the outcome of a single match between two players.

    Args:
      winner:  the id number of the player who won
      loser:  the id number of the player who lost
    """
    connection = connect()
    cursor = connection.cursor()
    query1 = "INSERT INTO Matches (playerid, opponentid, result) VALUES (%s, %s, 'win')"
    query2 = "INSERT INTO Matches (playerid, opponentid, result) VALUES (%s, %s, 'lose')"
    cursor.execute(query1, (winner, loser, ))
    cursor.execute(query2, (loser, winner, ))
    connection.commit()
    connection.close()
 
 
def swissPairings():
    """Returns a list of pairs of players for the next round of a match.
  
    Assuming that there are an even number of players registered, each player
    appears exactly once in the pairings.  Each player is paired with another
    player with an equal or nearly-equal win record, that is, a player adjacent
    to him or her in the standings.
  
    Returns:
      A list of tuples, each of which contains (id1, name1, id2, name2)
        id1: the first player's unique id
        name1: the first player's name
        id2: the second player's unique id
        name2: the second player's name
    """
    standings = playerStandings()
    count = 0;
    results = [];
    for player in standings:
    	count += 1
    	if (count % 2 == 0):
    		pair = (standings[count - 2][0], standings[count - 2][1], standings[count - 1][0], standings[count - 1][1])
    		results.append(pair)
    return results


