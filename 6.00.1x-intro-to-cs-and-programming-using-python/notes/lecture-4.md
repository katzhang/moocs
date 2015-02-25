
## Lecture 4: functions
* function: black-box abstraction of computation details
* numbers, assignments, input, output, comparisons, looping constructs --> Turing complete
* function provides abstraction
* environments to bindings: pair function name with a procedure object without evaluating expressions inside of the function
* when a function gets called, bindings happen between argument values and parameter names. also start a new frame, having the environment where the procedure was defined as a parent. function itself creates a new environment from the global one --> abstraction
* bindings of variables: each function call creates a new environment, which scopes bindings of formal parameters and values, and of local variables (those created with assignments within function body)  --> this scoping often called "static" or "lexical" because scope within which variables has value is defined by extent of code boundaries
* nested function observations: each call to square (the inside function) created a new frame with a local binding for x; the value of x in the global environment was never confused with values within frames from function calls; the value of x used by the call to square is different from the binding for x in the call to twoPower. 
function specifications: a contract between implementer of function and user: assumptions (what should be passed as parameters) and guarantees (things to return)
* 2 properties of functions: decomposition (break problems into modules); abstraction (hide details)
* modularity: group functions and can be imported; dot notation
