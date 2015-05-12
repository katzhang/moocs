##Unified Modeling Language

* data modeling: how to represent data for application
	* relational model
	* XML
	* database design model - higher level
		* not implemented by system
		* translated into model of DBMS
		
* higher-level database design models
	* entity-relationship model
	* uml (data modeling subset)
	* both are graphical and can be translated to relations automatically
	
* uml 5 concepts
	* classes
		* name, attributes, methods
		* for example, "student" class, attributes: sId(primary key), sName, ...
	* associations
		* relationships between objects of two classes
		* multiplicity of associations: each object of C1 is related to at least m and at most n objects of C2 : one-to-one, many-to-one, .etc
	* association classes
		* relationships between objects of two classes, with attributes on relationships
		* in UML we cannot capture same object's multiple relationships with another object
		* unnecessary if 0..1 or 1..1
	* subclasses
		* have attributes inherited from superclass and have its specific attributes/associations
		* complete/incomplete, overlapping/disjoint
	* composition and aggregation
		* composition: objects of one class belong to objects of another class
		* aggregation

* UML to relations
	* user-friendly(graphical) spec language and be translated into model of DBMS
	* classes: every class becomes a relation
	* associations: becomes relation with key from each side. key for that association relation depends on multiplicity (or becomes an attribute)
	* association classes: add attributes to relation for association
	
	
		
		