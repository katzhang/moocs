// gcd.cpp: Kat Zhang
// Description: computes the greatest common divisor given two integers

#include <iostream>
#include <algorithm>

using namespace std;

int main() {
	int num1, num2, smaller, gcd;
	do {
		cout << "enter a number: ";
		if (!(cin >> num1)) {
			cin.clear();
			cin.ignore(1000000, '\n');
			cout << "you entered a non-numeric. it was ignored. " << endl;
			continue;
		} else {
			break;
		}
	} while (true);

	do {
		cout << "enter a number: ";
		if (!(cin >> num2)) {
			cin.clear();
			cin.ignore(1000000, '\n');
			cout << "you entered a non-numeric. it was ignored. " << endl;
			continue;
		} else {
			break;
		}
	} while (true);

	if (num1 > num2) {
		smaller = num2;
	} else {
		smaller = num1;
	}

	for (int i = 1; i <= smaller; i++) {
		if (num1 % i == 0 && num2 % i == 0) {
			gcd = i;
		}
	}

	cout << "the gcd is: " << gcd << endl;

}