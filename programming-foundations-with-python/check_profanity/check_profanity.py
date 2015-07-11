import urllib

def read_text():
	quotes = open("/Users/katzhang/Documents/Personal Projects/mooc/programming-foundations-with-python/check_profanity/movie_quotes.txt")
	contents = quotes.read()
	check_profanity(contents)
	quotes.close()
	
def check_profanity(text_to_check):
	connection = urllib.urlopen("http://www.wdyl.com/profanity?q=" + text_to_check)
	response = connection.read()
	if "true" in response:
		print("it contains curses")
	else:
		print("it does not contain curses")

read_text()