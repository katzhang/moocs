##Constraints and Triggers

* for relational databases; SQL standard
* constraints: impose restrictions on allowable data, beyond those imposed by structure and types
	* example: 0.0 < GPA <= 4.0
	* why use them? catch data entry errors (for inserts); correctness criteria (for updates); enforce consistency; tell system about data
	* declaration: with original schema or later
	* enforcement: check after every modification; deferred
	
* triggers: monitor database changes, check conditions and initiate actions
	* "event-condition-action rules": when event occurs, check condition; if true, do action
	* example: if enrollment > 35,000 => reject all applications
	* why use them? move logic from apps into DBMS; enforce constraints