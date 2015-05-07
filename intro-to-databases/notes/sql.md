##SQL

* can be interactive via GUI or prompt, or embedded in programs
* DDL (data definition language): create, drop tables
* DML (data manipulation language): select, insert, delete, update
* other commands

* SELECT
	* select (attributes)) from (relations) where (condition)
	* need to write the join condition explicitly in SQL
	* select distinct: remove duplicates
	* order by clause
	* pattern match: where attire like '%pattern%'
	* calculate column on the fly
	
* table variables and set operators
	* can give relation a variable
	
* set operators:
	* union: in SQL by default eliminate duplicates
	* intersect: some systems don't have it
* subqueries in where
	* subqueries: nested select statements: in, not in
	* if using join (from r1, r2), might double-count certain
	* exists, not exists
	* all 
	* any
* subqueries in FROM and SELECT
	* from () NAME
* aggregation
	* aggregation functions: min, max, sum, avg, count
	* group by (columns)
	* having (condition)
	* union
	
	
* NULL values
	* attr is null
* data modification statements
	* inserting new data
		* insert into Table values(a1, a2...)
		* insert into Table (expressions)
	* deleting existing data
		* delete from table
	* update Table set attr = expression where condition

* join operators
	* inner join: theta join
	* natural join
	* inner join using attires
	* left right full outer join
	