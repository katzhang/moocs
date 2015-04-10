* key-value pair abstraction
    * insert a value with specified key
    * given a key, search for corresponding value
    * example: DNS lookup
    
* basic API: associative array abstraction
* value type: any generic type
* key type: several natural assumptions

best practices: use immutable types for key types

* symbol table implementation: elementary: use binary search
* ordered symbol table API
    * min, max, ceiling, floor, rank ...can be done with binary search
    * major flaw of binary search: can't efficiently maintain dynamic table
    
* binary search trees
    * BST: a binary tree in symmetric order
    * binary: either empty or has two disjoint binary trees
    * symmetric order: each node has a key and every node's key is larger than all keys in its left subtree, 
        or smaller than all keys in its right subtree
    * correspondence to quicksort if 1-1 (no duplicate keys)
    
* ordered operations in BSTs
* deletion in BSTs: Hibbard deletion (drawback: not symmetric)

    
    
    
    
    

