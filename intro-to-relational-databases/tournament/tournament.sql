-- Table definitions for the tournament project.
--
-- Put your SQL 'create table' statements in this file; also 'create view'
-- statements if you choose to use it.
--
-- You can write comments in this file by starting them with two dashes, like
-- these lines here.

CREATE TABLE Players (	
	name TEXT,
	playerid SERIAL primary key
    );

CREATE TABLE Matches (
	playerid SERIAL references players(playerid),
	opponentid SERIAL references players(playerid),
	result TEXT,
	matchid SERIAL primary key
);


-- Creates a view of wins count for each player
CREATE VIEW WinsCount AS 
	SELECT Players.playerid, COUNT(wonMatches) as num
	FROM Players
	LEFT JOIN (SELECT * FROM Matches WHERE result = 'win') as wonMatches
	ON Players.playerid = wonMatches.playerid
	GROUP BY Players.playerid;

CREATE VIEW MatchesCount AS
	SELECT Players.playerid, COUNT(Matches) as num
	FROM Players
	LEFT JOIN Matches
	ON Players.playerid = Matches.playerid
	GROUP BY Players.playerid;





