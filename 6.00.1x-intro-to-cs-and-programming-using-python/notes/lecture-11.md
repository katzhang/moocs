##Lecture 11: classes
* Python supports many different kinds of data
* each of the above is an object
* object have:
	* a type
	* an internal data representation (primitive, or composite)
	* a set of procedures for interaction with the object
	
* example: list
	* internal data representation: int length L, an object array of size S >= L or, a linked list of individual cells
	* procedures for manipulating lists
* OOP
	* everything is an object and has a type
	* objects are a data abstraction that encapsulate: internal representation and interface for interacting with object
	* advantages: 
		* divide and conquer development: implement and test behavior of each class separately; increase modularity
		* classes make it easy to reuse code: each class has a new environment (no collisions)
		
* Python's class:
	* `class SomeClass:`
	* `__init__` method: when creating an instance of a type, we will want to provide some initial values for the internal data.
	* `self` parameter in `__init__`: pointer to the instance
	* procedural attributes vs. data attributes (vars inside an instance)
* an environment view of classes
* print an object in Python: messy --> define a `__str__` method
* check type of instances: `isinstance(instance, Class)`
* adding other methods: first argument: self


	

	
	
	
	