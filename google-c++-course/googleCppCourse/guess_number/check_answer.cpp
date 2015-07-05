#include <iostream>
using namespace std;

int main() {
	srand(time(NULL));
	int answer = rand() % 100 + 1;
	int guess;

	do {
		cout << "enter a guess (-1 = quit): ";
		if (!(cin >> guess)) {
			cin.clear();
			cin.ignore(1000000, '\n');
			cout << "you entered a non-numeric. please enter a numeric. " << endl;
			continue;
		}
		if (guess != -1) {
			if (guess > answer) {
				cout << "your guess is too high. try a lower number. " << endl;
			} else if (guess < answer) {
				cout << "your guess is too low. try a higher number. " << endl;
			} else {
				cout << "congrats! your guess is right. " << endl;
				break;
			}
		}
	} while (guess != -1);
}