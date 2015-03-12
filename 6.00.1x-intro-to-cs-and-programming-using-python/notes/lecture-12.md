##Lecture 12: object-oriented programming

* class inheritance: `class SubClass(SuperClass):`
* class attributes: an attribute that belongs to the class, not instances of class
* generators: any procedure with a `yield` statement in it
	* every instance of a generator has a next method associated with it, which starts/resumes execution of the procedure, until it meets `yield` and returns a value
	* we can use a generator inside a loop statement
	* a generator separates the concept of computing a very long sequence of objects, from the actual process of computing them explicitly
	* a generator allows one to generate each new object as needed as part of another computation, rather than computing a very long sequence, only to throw most of it away while you do something on an element, then repeating the process