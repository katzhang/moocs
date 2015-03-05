##Lecture 9: efficiency and orders of growth

* measure complexity of different classes of algorithms
* goals in designing programs:
	* returns the correct output for all legal inputs
	* performs the computation efficiently
* measure efficiency, 2 ways:
	* how fast it runs -- time
	* how much memory it takes -- space
* several factors that affect running time: speed of computer, language implementations, value of inputs --> we want to avoid 1 & 2 --> need a general way to measure complexity --> RAM model
* RAM model
	* steps executed sequentially
	* step is an operation that takes constant time (assignment, comparison, arithmetic operations, accessing object in memory)
	
* cases:
	* best case: min time over all possible inputs of a given size (constant, independent of size)
	* worst case: max time (linear in size of input) --> focus
	* average
	
* we only care about the growth of the size of the problem --> multiplication factor doesn't matter
* will focus on measuring the complexity as a function of input size
	* the largest factor in this expression
	* mostly concerned with the worst case scenario
* asymptotic notation: need a formal way to talk about relationship between running time and size of inputs, mostly interested in what happens as size of inputs gets very large
	* describe running time in terms of number of basic steps
	* if running time is sum of multiple terms, keep one with the largest growth rate
	* if remaining term is a product, drop any multiplicative constants
	* use "big O" notation
	
* complexity classes: O(1), O(log n), O(n), O(n log n), O(n^c), O(c^n)
* logarithmic complexity: complexity grows as log of size of one of its inputs
	* example: bisection search, binary search of a list
* linear complexity
	* search in a list
	* complexity can depend on number of recursive calls
* most common algorithms: O(n log n), O(n^2)
* exponential complexity: recursive functions where more than one recursive call for each size of problem

	