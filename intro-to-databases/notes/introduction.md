##Introduction

* data model: a description of how the data is structured. In relational databases, the data is thought a set of records.
* schema versus data: schema are like "types".
* data definition language (DDL): set up schema. 
* data manipulation or query language (DML)


##Relational Databases

* the relational model:
	* database: a set of named relations (tables)
	* each relation has a set of named attributes (columns)
	* each tuple (or row) has a value for each attribute
	* each attribute has a type (or domain)
	* schema: structural description of relations in databases
	* instance: actual contents at given point in time
	* key: attribute whose value is unique in each tuple (for example, an ID) or a set of attributes whose combined values are unique
* querying relational databases
	* steps in creating and using a relational database: 
		* design schema, create using DDL
		* "bulk" load initial data
		* repeat: execute queries and modifications
	* support ad-hoc queries in high-level language
	* query languages: relational algebra(formal) and SQL(acutal)
	
	

