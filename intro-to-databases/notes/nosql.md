##NoSQL

* SQL: traditional relational DBMS
* recognition over past decadeor so: not every data management/analysis problem is best solved using a traditional relational DBMS
* what's wrong with SQL?
	* much more massive data, and much higher efficiency requirements
	
* NoSQL systems: 
	* flexible schema
	* quicker/cheaper to set up
	* massive scalability
	* relaxed consistency -> higher performance and availability
	* no declarative query language -> more programming
	* relaxed consistency -> fewer guarantees
	
* example: web log analysis
	* record: UserID, URL, timestamp, additionalinfo
	* task: load into database system
	in the SQL way...
		* data cleaning
		* data extraction
		* verification
		* schema specification
		
* NoSQL systems
	* several incarnations, types
		* MapReduce framework ~ OLAP
			* no data model, data stored in files
			* user provides specific functions: map()(break down problem into subproblems), reduce(do work on subproblems)(), reader, writer, combiner
			* system provides data processing "glue", fault-tolerance, scalability
			* schemas and declarative queries are missed: Hive (schema, SQL-like query language), and Pig (more imperative but with relational operators)
			* both compile to "workflow" of Hadoop (MapReduce) jobs
		* key-value stores ~ OLTP
			* extremely simple interface
			* data model: key value pairs
			* operations: insert(key, value), fetch(key), update(key), delete(key)
			
		* document stores
			* like key-value stores except value is document
			* data model: (key, document) pairs
			* document: JSON, XML, .etc
			* basic operations: insert, fetch, update, delete
			* can also fetch based on document contents
			* example systems: MongoDB, CouchDB, .etc
		* graph database systems
			* data model: nodes and edges
			* nodes may have properties (including ID)
			* edges may have labels or roles
			* interfaces and query languages vary
			* example systems: Neo4j, FlockDB, Pregel, ...
		