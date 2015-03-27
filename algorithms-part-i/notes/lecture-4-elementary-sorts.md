##elementary sorts

* sorting problem
    * goal is to sort any type of data
    * how can sort() know the key when given different types of data? -> callback
    * Comparable interface (Java's built-in): return -1, +1, or 0
    
* total order

* comparable API: implement compareTo() so that v.compareTo(w) is a total order

* two useful sorting abstractions: less, exchange

* selection sort
    * algorithm: scans from left to right

* insertion sort
    * in iteration i, swap a[i] with each larger entry to its left
    * concept of partially sorted: number of inversions <= cN
    * for partially sorted arrays, linear time
    
* shellsort
    * move entries more than one position at a time by h-sorting the array
    * to h-sort, use insertion sort
    * a g-sorted array remains g-sorted after h-sorting it
    * which increment sequence to use
    
* shuffle sort
    * Knuth shuffle: in iteration i, pick integer r between 0 and i uniformly at random; swap a[i] and a[r]
    
* convex hull
    * 