// banner_printer.cpp
// Description: prints large letters of banners or phrases

#include <iostream>
using namespace std;

#define WIDTH 5


void printLine(int list[WIDTH]) {
	for (int i = 0; i < WIDTH; i++) {
		if (list[i] == 1) {
			cout << "E";
		} else {
			cout << " ";
		}
	}
	cout << endl;
}

void printF() {
	int line1[] = {1, 1, 1, 1, 1};
	int line2[] = {1, 0, 0, 0, 0};
	int line3[] = {1, 1, 1, 0, 0};

	printLine(line1);
	printLine(line2);
	printLine(line3);
	printLine(line2);
	printLine(line2);
}

int main() {
	printF();
}