#include <stdio.h>
#include <stdlib.h>
#define SIZE 1024
#define WIDTH 30

void wrap(char s[]) {
	int i, k, nextwrap;

	for (i = 0; s[i] != '\0'; i++, nextwrap++) {
		if (nextwrap >= WIDTH) {
			s[i] = '\n';
			nextwrap = 0;
		}

	}

	printf("%s", s);
}

int main() {
	char line[SIZE];
	char *string;

	while (fgets(line, SIZE, stdin) != NULL) {
		wrap(line);
	}
}