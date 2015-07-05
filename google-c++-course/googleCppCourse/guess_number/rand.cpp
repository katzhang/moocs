// rand.cpp
// Description: generates a random number between 1 and 100

#include <iostream>
using namespace std;

int main() {
	srand(time(NULL));
	int num = rand() % 100 + 1;
	cout << "your random number: " << num << endl;
}