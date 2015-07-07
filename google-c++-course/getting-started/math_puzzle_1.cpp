// math_puzzle_1.cpp
// Description: a farmer buys 100 animals for $100 and how many of each animal he bought

#include <iostream>
using namespace std;

int main() {
	for (int i = 0; i <= 100; i++) {
		for (int k = 0; k <= 100; k++) {
			if (9.5 * i + 2.5 * k == 100) {
				cout << "he bought " << i << " horses, " << k << " pigs, and " << (100 - i - k) << " rabbits" << endl;
			}
		}
	}
}
