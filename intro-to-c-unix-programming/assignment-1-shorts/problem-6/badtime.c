#include	<stdio.h>
#include 	<string.h>


#define	LINESIZE	512
#define	TRUE		1
#define	FALSE		0

int line_has_bad_time(char line[])
{
	char * colon;
	colon = strstr(line, ":");
	if (colon) {
		int colonindex = colon - line;
		if (line[colonindex - 2] != '=' && line[colonindex - 2] > '2') {
			return TRUE;
		}
		if (line[colonindex + 1] > '5' ) {
			return TRUE;
		}
	}
	return FALSE;
}

int main()
{
	char	line[LINESIZE];			/* an array of characters */

	while ( fgets( line, LINESIZE, stdin) != NULL ) {
		if(line_has_bad_time(line)) {
			fputs(line, stdout);
		}
	}
	return 0;
}
