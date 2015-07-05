// hello.cpp: Kat Zhang
// Description: a program that prints the immortal saying "hello world"

#include <iostream>
using namespace std;

int main() {
	for (int i = 0; i < 6; i++) {
		for (int k = 0; k < 4; k++) {
			cout.width(17);
			cout << "hello world";
		}
		cout << endl;
	}
	return 0;
}