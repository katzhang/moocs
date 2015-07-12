// composer.h
// Description: the class for a Composer class

const int kDefaultRanking = 10;

class Composer {
	public:
		Composer();
		~Composer();

		void set_first_name(string in_first_name);
		string first_name();
		void set_last_name(string in_last_name);
		string last_name();
		void set_composer_yob(int in_composer_yob);
		int composer_yob();
 		void set_composer_genre(string in_composer_genre);
  		string composer_genre();
		void set_ranking(int in_ranking);
		int ranking();
		void set_fact(string in_fact);
		string fact();

		void Promote(int increment);
		void Demote(int decrement);
		void Display();

	private:
		string first_name_;
		string last_name_;
		int composer_yob_; // year of birth
		string composer_genre_; // baroque, classical, romantic, etc.
		string fact_;
		int ranking_;
}