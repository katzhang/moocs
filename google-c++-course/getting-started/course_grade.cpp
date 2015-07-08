// course_grade.cpp
// Description: computes grade for a course given certain breakdowns

#include <iostream>
using namespace std;

#define assignmentPercent 0.4
#define midtermPercent 0.15
#define finalPercent 0.35
#define classParticipationPercent 0.1

int getScore(string name) {
	int score;
	cout << "Enter the score for the " << name << ". ";
	if (!(cin >> score)) {
		cout << "Exiting...";
		return 0;
	} else {
		return score;
	}
}

int main() {
	double total;
	int assignmentScores, midtermScore, finalScore, classScore;
	total += ((getScore("first assignment") + getScore("second assignment") 
	+ getScore("third assignment") + getScore("fourth assignment")) / 4 * assignmentPercent);
	total += (getScore("midterm") * midtermPercent);
	total += (getScore("final") * finalPercent);
	total += (getScore("section grade") * classParticipationPercent);
	cout << "The final grade is: " << total << endl;
}