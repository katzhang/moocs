#!/bin/sh
# script.sh: sample shell script -- she-bang points to Bourne shell.
echo "Today's date: `date`"	# double quotes protect single quotes
echo "my login shell: $SHELL"	# $SHELL signifies login shell only
echo 'note the stty settings'
stty -a | grep intr
