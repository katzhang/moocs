#include	<stdio.h>
#include	<stdlib.h>
#define SIZE 10000
/*
 * rmtags.c
 *   purpose: remove tagged fields in a text file
 *     input: text
 *    output: text with tabs in place of semicolons
 *    errors: no error conditions
 *     usage: rmtags < input > output
 */

int main()
{
	char TR[100];
	char dir[100];
	char day[100];
	char TI[100];
	char stn[100];
	char Line[100];

	char text[SIZE];

	while (fgets(text, SIZE, stdin) != NULL) {
		scanf("TR=%[^;];dir=%[^;];day=%[^;];TI=%[^;];stn=%[^;];Line=%[^\n]", TR, dir, day, TI, stn, Line);
		printf("%s;%s;%s;%s;%s;%s\n", TR, dir, day, TI, stn, Line);
	}
	return 0;
}
