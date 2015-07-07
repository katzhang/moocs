// sales_salary.cpp
// Description: calculates given different salary methods

#include <iostream>
using namespace std;

#define flatSalary 600
#define hourlyRate 7.00
#define commisionRate1 0.1
#define commisionRate2 0.2
#define pairBonus 20
#define price 225
#define weeklyHours 40

int getInput() {
	int sales;
	cout << "enter a weekly sale number: ";

	if (!(cin >> sales)) {
		return 0;
	} else {
		return sales;
	}
}

void calculateMethod1() {
	cout << "method one: " << flatSalary << " dollars" << endl;
}

void calculateMethod2(int num) {
	double total = 0;
	total += hourlyRate * weeklyHours;
	total += price * num * commisionRate1;
	cout << "method two: " << total << " dollars" << endl;
}

void calculateMethod3(int num) {
	double total = 0;
	total += price * num * commisionRate2;
	total += 20 * num;
	cout << "method three: " << total << " dollars" << endl;
}

int main() {
	int units = getInput();
	calculateMethod1();
	calculateMethod2(units);
	calculateMethod3(units);
}
