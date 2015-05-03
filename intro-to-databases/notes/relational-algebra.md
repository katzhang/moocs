##Relational Algebra

* simplest query: relation name
	* example: student
	* use operators to filter, slice and combine relations
		* SELECT: pick certain rows: sigma(col) relation
		* PROJECT: pick certain columns: pi(cols*) relation
		* to pick both rows and columns --> compose operators
		
* duplicates
	* SQL doesn't eliminate duplicates but relational algebra does
* cross-product: combine two relations
	* when we glue two relations (tables) together, there might be common attires
* natural join: enforce equality on all attires with same same; eliminate one copy of duplicate attributes
* theta join: joins two expressions but add a condition
* set operators
	* UNION: combine tuples vertically rather than horizontally (cross-product, natural join)
	* DIFFERENCE: minus sign
	* INTERSECTION: doesn't add expressive power
* rename operator
	* reassigns the schema in the result of one expression
	
* assignment operators: :=, modularize expressions
* expression tree: 
