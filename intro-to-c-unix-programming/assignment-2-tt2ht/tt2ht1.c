#include <stdio.h>
#include <string.h>

#define LINESIZE 512

char output[LINESIZE * 20] = "<table>";

void write_row(char line[]) {
	char tr[LINESIZE] = "<tr>";
	char *td;

	td = strtok(line, " \t");

	while (td != NULL) {
		strcat(tr, "\n\t\t<td>");
		strcat(tr, td);
		strcat(tr, "</td>");
		td = strtok(NULL, " \t");
	}

	strcat(tr, "\n\t</tr>");

	printf("%s\n", tr);
	strcat(output, "\n\t");
	strcat(output, tr);

}

int main()
{
	char line[LINESIZE];			/* an array of characters */

	while (fgets(line, LINESIZE, stdin) != NULL) {
		write_row(line);
	}
	strcat(output, "\n</table>");
	printf("%s\n", output);
	return 0;
}