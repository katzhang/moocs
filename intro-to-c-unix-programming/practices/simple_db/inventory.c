/* maintains a parts database (array version) */
#include <stdio.h>
#include "readline.h"

#define NAME_LEN 25
#define MAX_PARTS 100

struct part {
	int number;
	char name[NAME_LEN + 1];
	int on_hand;
} inventory[MAX_PARTS];

int num_parts = 0; 

int find_part(int number);

void insert(void);
void search(void);
void update(void);
void print(void);

int main(void) {
	char code;

	for(;;) {
		printf("enter operation code: ");
		scanf(" %c", &code);
		while (getchar() != '\n')
			;
		switch (code) {
			case 'i': insert();
			break;
			case 's': search();
			break;
			case 'u': update();
			break;
			case 'p': print();
			break;
			case 'q': return 0;
			default: printf("illegal code \n");
		}
		printf("\n");
	}
}

int find_part(int number) {
	int i;

	for (i = 0; i < num_parts; i++) 
		if (inventory[i].number == number) 
			return i;

	return -1;
}

void insert(void) {
	int part_number;

	if (num_parts == MAX_PARTS) {
		printf("database is full; can't add more parts.\n");
		return;
	}

	printf("Enter part number: ");
	scanf("%d", &part_number);

	if (find_part(part_number) >= 0) {
		printf("part already exists");
		return;
	}

	inventory[num_parts].number = part_number;
	printf("enter part name: ");
	read_line(inventory[num_parts].name,  NAME_LEN);
	printf("enter quantity on hand: ");
	scanf("%d", &inventory[num_parts].on_hand);
	num_parts++;
}

void search(void) {
	int i, number;

	printf("enter part number: ");
	scanf("%d", &number);
	i = find_part(number);
	if (i >= 0) {
		printf("part name: %s\n", inventory[i].name);
		printf("quantity on hand: %d\n", inventory[i].on_hand);
	} else {
		printf("part not found.\n");
	}
}

void update(void) {
	int i, number, change;

	printf("enter part number: ");
	scanf("%d", &number);
	i = find_part(number);
	if (i >= 0) {
		printf("enter change in quantity on hand: ");
		scanf("%d", &change);
		inventory[i].on_hand += change;
	} else {
		printf("part not found.\n");
	}
}

void print(void) {
	int i;

	printf("part number\tpart name\tquantity on hand\n");
	for (i = 0; i < num_parts; i++)
		printf("%7d\t%-25s\t%11d\n", inventory[i].number, inventory[i].name, inventory[i].on_hand);
}























