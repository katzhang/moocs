##bags, stacks and queues

* operations: insert, remove, iterate, test if empty, .etc --> intent is clear when we insert
* but which item do we remove? LIFO(stack), FIFO(queue)

* modular programming - separate details of implementation from client

* two approaches to implement stacks: linked list and resizing array
    * resizing array --> repeated doubling to expand, shrink when one-quarter is full
* the same approaches can be applied to implementing queues as well

* generics: what about other types of data than strings?
    * attempt 1: implement a separate stack but it is tedious and error-prone
    * attempt 2: implement a stack with items of type object -> casting is required in client
    * attempt 3: Java generics: type parameter: Stack<Item>. works for linked lists but Java doesn't allow for generic array
    (has to do cast)
    * for primitive types: wrapper type
    
* iteration: support iteration over stack items without revealing the internal representation of the stack
    * the Iterable interface: has a method that returns an Iterator.
    * Iterator: hasNext(), and next()
    
    
* bag API
    * adding items to a collection and iterating. order doesn't matter
    * 
  


