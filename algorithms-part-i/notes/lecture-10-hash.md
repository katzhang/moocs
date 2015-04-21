* save items in a key-indexed table (index is a function of key)
* hash function: method for computing array index from key
* issues:
    * computing hash function
    * equality test: checking if two keys are equal
    * collision resolution
    
* classic space-time tradeoff

* hash function: scramble the keys uniformly to produce a table index
    * efficiently computable
    * each table index equally likely for each key
    
* in Java: hashCode() function
* standard recipe for user-defined types: combine eah significant field using the 31x + y rule (y being constant, usually a prime)

* collisions
    * separate chaining symbol table
    * linear probing: open addressing, when a new key collides, find next empty slot and put it there
    
