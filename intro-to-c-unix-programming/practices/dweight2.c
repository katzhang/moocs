/* Computes the dimensional weight of a box from input provided by the user */

#include <stdio.h>

int main(void) 
{
	int height, length, width, volume, weight;

	printf("enter height: ");
	scanf("%d", &height);
	printf("enter length: ");
	scanf("%d", &length);
	printf("enter width: ");
	scanf("%d", &width);

	volume = height * length * width;
	weight = (volume + 165) / 166;

	printf("Volume (cubic inches): %d\n", volume);
	printf("Dimensional weight (pounds): %d\n", weight);

	return 0;
}