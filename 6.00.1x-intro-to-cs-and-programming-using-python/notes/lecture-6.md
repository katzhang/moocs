##Lecture 6: Objects

objects: compound data types

* tuples, lists, dictionaries
* tuples: ordered sequence of things. concatenation, indexing, slicing, singletons(tuple with a single element, for example, ('five',)), iteration (for..in)
* lists: ordered sequence of values. square brackets. singletons don't have to have the comma (['singleton']).
* difference: lists are mutable. ints, floats, strings and tuples are immutable.
* sometimes we don't wanna change data objects. mutable data objects are more prone to bugs. 
* aliasing: two distinct paths to a data object (through variable, through the pointer to that variable). change in one place will be reflected in all paths --> sharing data
* operations on lists
	* iteration: for ... in
	* append
	* concatenation: +, a flat version
	* clone: l1[:]
	* compare: list1 is list2
	
* when we mutate a list (while iterating over it), we change its length but Python doesn't update counter

* first class objects:
	* have types
	* can be an element in a data structure, like a list
	* can appear in an expression, like an assignment statement
	* can be an argument to a function
* ints, floats, strings, lists and tuples and ...functions are all first class objects
* particular useful to use functions as elements --> higher order programming
* generalization of higher order functions: map
* dictionaries: a generalization of lists, but now indices can be values of any immutable type
	* <key, value>
	* access value via key
	* keys can be tuples (immutable), but not lists
