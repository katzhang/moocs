#include <stdio.h>

int main(void)
{
	int i, n;
	printf("this program prints a table of squares. \n");
	printf("enter number of entries in the table: ");
	scanf("%d", &n);

	for (i = 1; i <= n; i++) {
		printf("%10d%10d\n", i, i * i);
	}

	return 0;
}
