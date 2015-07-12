// database.h
// Description: Class for a database of Composer records

#include <iostream>
#include "Composer.h"

const int kMaxComposers = 100;

class Database {
	public:
		Database();
		~Database();

		Composer& AddComposer(string in_first_name, string in_last_name,
			string in_genre, int in_yob, string in_fact);
		Composer& GetComposer(string in_last_name);
		void DisplayAll();
		void DisplayByRank();

	private:
		Composer composers_[kMaxComposers];
		int next_slot_;

}