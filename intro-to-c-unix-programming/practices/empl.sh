#!/bin/sh
# empl.sh: interactive version - uses read to take two inputs
#

echo "Enter the pattern to be searched: \c"
read pname
echo "enter the file to be used: \c"
read flname
echo "searching for $pname from file $flname"
grep "$pname" $flname
echo "selected lines shown above"