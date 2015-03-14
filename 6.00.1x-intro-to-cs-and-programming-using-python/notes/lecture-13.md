##Lecture 13: trees
* trees: store hierarchical data, good for manipulating and searching data; capture decision problems
* definition: a tree consists of one or more nodes (a node typically has a value associated with it)
	* nodes are connected by branches
	* root node (natural tree upside down)
	* except for leaves, each node has one or more children (we refer to a node which has a child as the parent node)
	* in simple cases, no child has more than one parent
	
* binary tree: all of the nodes either have 0 or 2 children; useful when storing and searching ordered data, or when determining the best decision to make in solving many classes of problems
* search a tree
	* depth first search:
		* start with the root
		* at any node if haven't found the objective, take left branch first
		* when get to a leaf, backtrack to the first decision point and take the right branch
	* breadth first search
		* start with the root
		* proceed to each child at the next level, in order
		* continue until found
* depth first search for containment
	* idea is to keep a data structure (a stack) that holds nodes still to be explored
	* use an evaluation function to determine when reach objective
	* start with root node
	* then add children, to front of data structure, with left branch first
	* continue in this manner
* breadth first search for containment
	* use queue to store children nodes(put new things at the end)
* if tree is ordered: 
* decision tree: 
	* at each node a decision is made, with a positive decision taking the left branch, and a negative decision take the right branch
	* the knapsack problem: finite size backpacks, objects with a value and a size; goal is store the items that have the most value
	* use binary tree to solve knapsack problem: at root level we decide whether to include an item
	* depth first and breadth first still search the same number of nodes, the order is different
	* if we are ok with a "good enough" solution, the two are going to be different--> breadth-first takes longer
	* search an implicit tree: without constructing the entire decision tree, generate the nodes of the tree as needed
	
* what if there are loops in trees? -> generalization is a graph
	* depth-first: infinite loop in many cases when the item is present
	* breadth-first: less efficient
	
	
	
	