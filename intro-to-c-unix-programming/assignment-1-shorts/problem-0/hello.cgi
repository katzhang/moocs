#!/bin/sh
# my first cgi program

echo "Content-type: text/plain"
echo ""

echo "Hello from "
hostname
echo "local time is "; date
