#include <stdio.h>

int main(void)
{
	int len = 0;

	printf("enter a message: ");
	while (getchar() != '\n') {
		len++;
	}

	printf("your message was %d character(s) long.\n", len);

	return 0;
}