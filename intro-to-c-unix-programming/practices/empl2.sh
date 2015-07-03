#!/bin/sh

echo "Program: $0"
echo "the number of arguments specified is $#"
echo "the arguments are $*"

grep "$1" $2
echo "\n job over"