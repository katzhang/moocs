##Lecture 10: search algorithms and memory

* if data is sorted -> binary search; if not, sort. combination of sorting and binary search can be very powerful
* new algorithms are hard to invent; easier to simplify problems to use existing altos
* search algorithms
	* method for finding an item or group of items with specific properties within a collection of items
	* collection: the search space
* linear search and indirection
	* in Python, does getting to the i-th element of the list take constant time?
	* memory location: if size of the element is known, a certain amount of memory will be allocated for each item
	* if item is of arbitrary size: indirection. each element of the list will be a pointer to an object, to a structure in memory. pointer tells the address of the element, and it can be found in constant time --> take 2 steps, but still constant time
	* so search is linear
* binary search: can we do better than O(len(L))?
	* if know nothing about the values, no
	* if elements are sorted in ascending order -> can improve things
	
* use binary search
	* pick an index, that divides list in half
	* ask if L[i] == e
	* if not, ask if L[i] larger or smaller than e
	* depending on answer,search left or right half of L for e
* analyze binary search
	* does the recursion halt? 
	* check if it is decrementing function
	* complexity: O(log(len(L)))
* sorting algorithms
	* assume sorting complexity is O(sort(L)), we wanna know the combined complexity of sorting and searching is less than linear searching: sort(L) + log(len(L)) < len(L)
	* sort(L) at least has to be at least linear: have to look at each element to sort
	* but if we want to search a list k times, then, sort(L) + k * log(len(L)) < k * len(L) --> depending on k
	* spending cost of sprint over multiple searches
	
* selection sort
	* continually swap nth smallest element with the nth current element in that n position
* analyzing selection sort
	* loop variant: given prefix of list(L[0:i]) and suffix L[i+1:len(L)-1], ...
	* complexity: O(len(L)^2), quadratic 
* amortize: instead of just considering the worst scenario, consider entire sequence of operations
* better sort: merge sort
	* use a divide-and-conquer approach
	* when merging: number of comparisons to do: O(len(L1) + len(L2))
	* complexity of merge sort: O(len(L)) * number of calls to merge -> since it's divide and conquer, it's log -> O(len(L)) * log(len(L)), O(n log n)
* Python dictionary use concept of hashing: lookup can be done independent of dictionary's size
* hashing: converts key to an int, use int to index into a list; conversion done using a hash function
	* it's possible for two keys to the same location --> a collision
	* complexity of hashing: if no collisions, then O(1); otherwise, O(n); in general trade off space to make hash table large, and with good function get close to uniform distribution and reduce complexity to close to O(1)
	
