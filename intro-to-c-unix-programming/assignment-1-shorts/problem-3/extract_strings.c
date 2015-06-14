#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define SIZE 1024

int main() {
	char line[SIZE];
	char *string;
	char sample_msg[] = "he said \"hi\"";

	while (fgets(line, SIZE, stdin) != NULL) {
		// int i;
		// int in = 0;

		// for (;i < SIZE; i++) {
		// 	if (line[i] == '\"' && line[i - 1] != '\\' && !in) {
		// 		in = 1;
		// 	} else if (line[i] == '\"' && line[i - 1] != '\\' && in) {
		// 		in = 0;
		// 	}
		// 	if (in) {
		// 		printf("%c", line[i]);
		// 	}
		// }
		string = strtok(line, "\"");
		string = strtok(NULL, "\"");

		if (string != NULL) {
			printf("%s\n", string);
		}
	}
}