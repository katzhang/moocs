// get_input.cpp: Kat Zhang
// Description: Illustrate the use of cin to get input.

#include <iostream>
using namespace std;

int main() {
	int input_var = 0;
	do {
		cout << "enter a number (-1 = quit): ";
		if (!(cin >> input_var)) {
			cout << "you entered a non-numeric. exiting... " << endl;
			break;
		}
		if (input_var != -1) {
			cout << "you entered " << input_var << endl;
		}
	} while (input_var != -1);
	cout << "all done. " << endl;
	return 0;
}