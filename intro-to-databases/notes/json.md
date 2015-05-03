##JSON

* standard for "serializing" data objects, usually in files
* human-readable, useful for data interchange
* useful for representing and storing semistructured data
* compared with relational data model:
	* JSON does not have schema - "self-describing"
	
* compared with XML: a lot of overlapping use cases
	* for validity, XML has DTDs and XSDs; JSON has JSON schema but not widely used
	* neither XML or relational models matches data structures in programming languages --> impedance mismatch
	* JSON doesn't have widely used query languages
	
* reserved words: true, false, null
* JSON schema
	* in the format of JSON
	* can constrain types, range (minimum and maximum for integers);