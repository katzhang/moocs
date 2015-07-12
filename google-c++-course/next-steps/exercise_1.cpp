// exercise_1.cpp
// Description: find a number that is a perfect square and the sum of 1 through n, n being an integer

#include <iostream>
#include <cmath>
using namespace std;

int is_perfect_square(double num) {	
	double root = sqrt(num);
	return floor(root) == root;
}


int main() {
	int total_count = 0;
	double num = 0;
	double iterator = 0;
	do {
		iterator++;
		num += iterator;
		if (is_perfect_square(num)) {
			cout << "the next number like that is " << num << "." << endl;
			total_count++;
		}
	} while (!is_perfect_square(num) || total_count < 4);
}