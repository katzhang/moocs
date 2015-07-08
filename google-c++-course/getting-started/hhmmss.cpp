// hhmmss.cpp
// Description: converts seconds into hours, minutes and seconds

#include <iostream>
using namespace std;

#define secondsToHour 3600
#define secondsToMinute 60

int main() {
	int inputSeconds, hour, minute, second, rest;
	cout << "Number of seconds: ";
	cin >> inputSeconds;
	hour = inputSeconds / secondsToHour;
	rest = inputSeconds % secondsToHour;
	minute = rest / secondsToMinute;
	second = rest % secondsToMinute;

	cout << "Hours: " << hour << endl << "Minutes: " << minute << endl << "Seconds: " << second << endl;
}