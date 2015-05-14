##transactions

* motivated by two requirements: concurrent database access and resilient to system failures
* concurrency goal: execute sequence of SQL statements so they appear to be running in isolation
* resilience to system failures:
	* hardware, software failures 
* solution for both concurrency and failures: transactions
* a transaction is a sequence of one or more SQL operations treated as a unit
	* transactions appear to run in isolation
	* if the system fails, each transaction's changes are reflected either entirely or not at all
	
* transaction properties
	* "acid"
	* isolation: serializability: operations may be interleaved, but execution must be equivalent to some sequential(serial) order of all transactions
	* durability: if system crashes after transaction commits all effects of transaction remain in database
	* atomicity: each transaction is "all or nothing", never left half done; transaction rollback(abort) undoes partial effects of transaction, can be system or client-initiated
	* consistency: each client, each transaction can assume all constraints hold when transaction begins; must guarantee all constraints hold when transaction ends
	
* isolation levels
	* read uncommitted: a transaction may perform dirty reads
	* read committed: may not perform dirty reads (still not guarantee global serializability)
	* repeatable read
	* serializable
	