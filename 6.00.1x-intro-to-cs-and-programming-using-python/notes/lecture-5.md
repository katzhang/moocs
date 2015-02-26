##Lecture 5: recursion
* iterative algorithms (looping constructs) can conceptualize as capturing computation in a set of "state variables" (update state variable, check)
another way: recursive version: reduce a problem to a simpler version of the same problem (recursive step); keep reducing until reach a simple case that can be solved directly (base case)
* some observations: 
	* each recursive call creates its own function environment; 
	* bindings for variables in each frame are distinct, and bindings are not changed by the recursive call; 
	* flow of control will pass back to earlier frame once function call returns its value
	
* inductive reasoning: iterative way and recursive way
* mathematical induction: to prove a statement indexed on integers is true for all values of n: prove it is true for smallest n and an arbitrary value of n (n+1)
* the classical recursive problem: factorial
	* n! = 1 if n = 1, n! = n * (n-1) if n > 1
	
* power of recursion's examples: towers of hanoi (multiple subproblems); Fibonacci (multiple base cases)
* solve non-numerical problem recursively: palindrome
* "divide and conquer": solve a hard problem by breaking it into a set of sub-problems

* global variables
	* bound to the outermost scope
	* use with care: it destroys locality of scope
	* can be modified everywhere; break locality and error-probing
	