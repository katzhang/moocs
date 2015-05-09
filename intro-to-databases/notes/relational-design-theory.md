##Relational design theory

* design a database schema
	* can use higher-level design tools

* good design
	* avoid redundancy: don't capture same information multiple times
	* no update anomaly: update one row and database becomes inconsistent
	* no deletion anomaly: inadvertently delete information
* design by decomposition
	* start with "mega" relations containing everything
	* decompose into smaller, better relations with same info
	* can do decomposition automatically
	
* properties and normal forms
	functional dependency: if same attr1 always yields same attr2; should store each attr1's atr2 only once
	* Boyce-Codd normal form: requires the left-hand side of functional dependencies to be a key for the relation (if a --> b, then a is a key)
	* multivalued dependency: given atr1 has every combination of atr2 with atr3; should store each atr2 and each attribute3 for an attribute1 once
	* 4th normal form: we want only one tuple that has each value that appears on the left hand side of a multi-value dependency
	