#include	<stdio.h>

/*
 *	empties
 *		read lines from standard input
 *		assume lines look like
 *			XX=stuff;YY=morestuff;..;ZZ=yetmorestuff
 *		printout lines that have one or more empty fields
 *
 *		need to read in a line first, examine it, then print it
 */

#define	LINESIZE	512
#define	TRUE		1
#define	FALSE		0

main()
{
	char	line[LINESIZE];			/* an array of characters */

	while ( fgets( line, LINESIZE, stdin) != NULL )
		if ( has_empty(line) == TRUE )
			fputs( line , stdout );
}

has_empty(char string[])
/*
 *	looks through the string to see if any fields are empty.
 *	this means that the character after an = is a colon or a newline
 *	return TRUE if any empties are found, else returns FALSE
 */
{
	int	i;		/* use this for indexing */

	for(i=0; string[i] != '\0' ; i++)
		if ( string[i]=='=' && (string[i+1]==';' || string[i+1]=='\n'))
			return TRUE;
	return FALSE;
}
