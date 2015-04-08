* priority queue: remove the largest (or smallest) item in the collection when it is to remove an item
* event-driven simulation application of pq: find the largest M items in a stream of N items
* how to find the largest ones?
    * sorting -> not enough memory (N)
    * elementary pq -> too slow (time: MN)
    * binary heap: time: NlogM, memory: M
* unordered, ordered; linked list, resizing arrays

* binary heap
    * binary tree: empty or node with links to left and right binary trees
    * complete tree: perfectly balanced, except for bottom level
    * property: height of complete tree with N nodes is lg N
    * binary heap: array representation of a heap-ordered complete binary tree:
        * keys in nodes
        * parents' key no smaller than children's keys
        
    * best practice: use immutable keys
    
    
* heapsort:
    * sort arbitary-ordered arrays: bottom-up approach
    * second pass: sort down: repeated delete the largest remaining item
    * in-place sorting algorithm with NlogN worst-case
    * optimal in time and space but not used much: longer inner loop, doesn't use cache memory
    
    
