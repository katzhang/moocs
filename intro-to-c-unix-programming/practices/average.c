#include <stdio.h>

double average(double a, double b) {
	return (a + b) / 2;
}

int main(void) {
	double x, y, z;

	printf("enter three numbers: ");
	scanf("%lf%lf%lf", &x, &y, &z);
	printf("average of %g and %g: %g\n", x, y, average(x, y));
	printf("average of %g and %g: %g\n", x, z, average(x, z));
	printf("average of %g and %g: %g\n", z, y, average(z, y));

	return 0;
}