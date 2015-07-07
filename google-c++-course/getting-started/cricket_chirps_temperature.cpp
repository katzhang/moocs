// cricket_chirps_temperature.cpp
// Description: computes temperature given number of cricket chirps

#include <iostream>
using namespace std;

int getChirps() {
	int chirps;
	cout << "Number of chirps: ";
	if (!(cin >> chirps)) {
		cout << "Exit";
		return 0;
	} else {
		return chirps;
	}
}

double computeTemp(int chirps) {
	return (double) (40.0 + chirps) / 4.0;
}

int main() {
	int chirps = getChirps();
	double temperature = computeTemp(chirps);
	cout << "The temperature is: " << temperature << " degrees. " << endl;
}