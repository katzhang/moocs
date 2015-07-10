// accelerate.cpp
// computes accelerated speed

#include <iostream>
using namespace std;

void accelerate(double &speed, double amount) {
	speed += amount;
}

int main() {
	double speed = 10;
	accelerate(speed, 3.5);
	cout << "now the speed is " << speed << endl;
}