// hello.cpp: Kat Zhang
// Description: a program that prints the immortal saying "hello world"

#include <iostream>
#include <iomanip>
using namespace std;

int main() {
	// cout <<  setiosflags(ios::left);
	for (int i = 0; i < 6; i++) {
		for (int k = 0; k < 4; k++) {
			cout << left << setw(17) << "hello world";
		}
		cout << endl;
	}
	return 0;
}