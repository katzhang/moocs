#include	<stdio.h>
#include	<string.h>

/*
 * incomplete.c
 *
 *	purpose	find `sched records' missing one or more fields
 *	method	read in a line, check for each tag, if any
 *		is missing, print out the line
 *	note	This program is like a reverse grep.  grep prints lines
 *		that contain a pattern, but this program prints
 *		lines that do not contain a pattern.
 */

#define	LINELEN	512			/* oughta be enough		*/

main()
{
	char	linebuf[LINELEN];	/* array to hold each line	*/
	
	while ( fgets( linebuf, LINELEN, stdin ) )
	{
		if ( 	missing( "TR=", linebuf )   ||
			missing( "day=", linebuf )  ||
			missing( "TI=", linebuf )   ||
			missing( "dir=", linebuf )  ||
			missing( "stn=", linebuf )  ||
			missing( "Line=", linebuf ) 
		)
		fputs( linebuf, stdout );
	}
}

missing( char lookfor[], char dataline[] )
/*
 * purpose: determine if the string 'lookfor' appears in 'dataline'
 * returns: 1 if it is MISSING, 0 if it appears
 *  method: uses strstr() to search for substrings in string
 */
{
	if ( strstr( dataline, lookfor ) )	/* is it there?		*/
		return 0;			/* Y: => not missing	*/
	return 1;				/* N: => IS  missing	*/
}
