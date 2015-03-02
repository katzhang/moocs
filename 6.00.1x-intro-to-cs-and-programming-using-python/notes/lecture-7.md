##Lecture 7: debugging

* testing methods & debugging methods
	* ways of trying code on examples
	
* design code for ease of testing and debugging
	* break code into components that can be easily tested separately
	* write good documentation (can be constraints)(expectations on input, output)

* ensure code will actually run
	* syntax error (handled by the language itself oftentimes)
	* remove static semantic errors
* specify expected results

* testing goal:
	* show bug exists
	* proving bug-free is hard
* test suite: partition of possible results
* black-box testing: when no natural partition to input space, use heuristics based on exploring paths through the specs
	* test suite designed without looking at the code (can be done by other than implementer) --> avoid inherent bias
	* separation of concerns (details of implementation from the use of the implementation)
	
	
* glass-box testing: use heuristics based on exploring paths through the code
	* use code directly to guide designed of test cases
	* path-complete: if every potential path through the code is tested at least once(not always possible)
* integration test and unit test
* test drivers: set up the test environment, invoke code on predefined sequence of inputs, save inputs and report. simulate the program that uses unit being tested
* stubs: simulate parts of program that used by unit being tested
* good test practice: 
	* start with unit test
	* move to integration test
	* after code is corrected, be sure to do regression testing
	
* debugging: runtime bugs: 
	* overt (obvious manifestation, program crashing) vs. covert (returns an incorrect value)
	* persistent vs. intermittent
	* subtle bugs are hard to detect even with defensive programming
	
* debugging skills:
	* treat as a search problem: looking for explanation for incorrect behavior (study available data, both correct and incorrect cases; form hypothesis; design and run repeatable experiment)
	* want to narrow down space of possible source of errors --> use 'print' statements

* some pragmatic hints
	* look for the usual suspects
	* focus on what the code is actually doing rather than trying to spot where the error is
	* the bug is probably not where you think it is -- eliminate locations
	* explain the problem to somebody else
	* 
	
