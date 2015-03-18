##Lecture-1: Union find
* quick find & quick union
* steps to develop an algorithm
	* model the problem
	* find an algorithm to solve it
	* fast enough? fits in memory?
	* if not, figure out why
	* find a way to address the problem
	* iterate until satisfied
* dynamic connectivity: give n objects, union command that connects two objects, and find/connected query
	* applications: pixels in photo, computers in network, social network, .etc
	* modeling connections: reflexive, symmetric, transitive
	* connected components: set of connected objects
	* find query: if two objects in the same component; union: merge components
	
* goal: design efficient data structure for union-find
* quick find (eager approach):
    * if in same component, have the same id
    * iterate over n objects -> quadratic algorithms, too expensive, don't scale
    
    