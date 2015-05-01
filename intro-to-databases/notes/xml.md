##XML data
* a data model, an alternative to relational database
* standard for data representation and exchange
	* document formats similar to HTML
	* tags describe content instead of formatting
	* basic constructs: tagged elements, attributes, text
	
* a lot of flexibility in XML's schema
* well-formed XML
* XML parser, displaying XML (use rule-based language to translate to HTML)
* valid XML: well-formed, and adheres to content-specific specs
* Document Type Descriptors (DTD)
	* grammar-like for specifying elements, attires, nesting, ordering
	* special attires types: ID and IDREFS (pointers)
	* pros: benefit of "typing"
	* cons: lack of flexibility, can be messy for irregular documents
	* validate XML: xml lint
	
* XML schema (XSD)
	* extensive language
	* like DTD, can specify el, attrs, nesting, .etc
	* also data types, keys, pointers, .etc
	* XSD is written in XML