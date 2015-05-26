##OLAP

* two broad types of database activity
	* OLTP: online transaction processing: short transactions, simple queries, touch small portions of data, frequent updates
	* OLAP: online analytical processing: the opposite

* data warehousing: bring data from operational (OLTP) sources into a single "warehouse" for (OLAP) analysis
* decision support system (DSS)

* "star schema"
	* one fact table: updated frequently, often append-only, very large
	* dimension tables: updated infrequently, not as large
	* fact table referencing dimension tables