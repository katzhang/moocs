import webbrowser
import time

total_breaks = 3
break_count = 0

print("The program starts at" + time.ctime())

while (break_count < total_breaks):
	time.sleep(4)
	webbrowser.open("http://www.google.com")
	break_count = break_count + 1

