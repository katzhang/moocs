// Artillery.cpp
// Description: a game that shoots enemy by providing a number for the angle

#include <iostream>
#include <cmath>
using namespace std;

#define VELOCITY 200.0
#define GRAVITY 32.2

void startUp() {
	cout << "Welcome to Artillery." << endl;
	cout << "You are in the middle of a war and being charged by thousands of enemies." << endl;
	cout << "You have one cannon, which you can shoot at any angle." << endl;
	cout << "You only have 10 cannonballs for this target.." << endl;
	cout << "Let's begin..." << endl;
}

double convertToRadians(double degrees) {
	double radians = degrees * M_PI / 180.0;
	return radians;
}

double hit(double angle, double distance) {
	double radian_angle = convertToRadians(angle);
	double time_in_air = (2.0 * VELOCITY * sin(radian_angle)) / GRAVITY;
	double result_distance = round((VELOCITY * cos(radian_angle)) * time_in_air);

	if (distance - 5 < result_distance && distance + 5 > result_distance) {
		return 0;
	} else {
		return result_distance - distance;
	}
}

int fire() {
	int shots = 0;
	srand(time(NULL));
	double distance = rand() % 900 + 100;
	double input_angle;
	double overshoot_distance;

	cout << "The enemy is " << distance << " feet away!!!" << endl;

	do {
		cout << "What angle? ";
		cin >> input_angle;
		shots++;

		overshoot_distance = hit(input_angle, distance);

		if (overshoot_distance == 0) {
			cout << "You hit him!!!" << endl;
			cout << "It took you " << shots << " shots." << endl;
			cout << "You have killed 1 enemy." << endl;
		} else {
			cout << "You " << ((overshoot_distance > 0 ) ? "over by ": "under by ") << abs(overshoot_distance) << " feet" << endl;
		}

	} while (overshoot_distance != 0);

	return 1;
}

int main() {
	startUp();
	int killed = 0;
	char done;
	do {
		killed += fire();
		cout << "I see another one, care to shoot again? (Y/N) " << endl;
		cin >> done;
	} while (done != 'n');
	cout << "You killed " << killed << " of the enemy." << endl;
}


