##Lecture 8: assertions and exceptions

* what to do with exceptions
	* fail silently: bad idea - no indication for users
	* return an "error" value
	* stop execution, signal error condition -> in Python, raise an exception
	
* syntax: try: ... except:: raise Exception('some exception')
* handling specific exceptions: usually the handler is only meant to deal with a particular type of exception. sometimes we need to clean up before continuing
* common types of exceptions: SyntaxError, NameError, TypeError, ValueError, IOError, AttributeError
* other extensions to "try": else clause, finally clause
* 