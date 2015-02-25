## Lecture 3: simple algorithms
* iteration: repeat executing a program arbitararily a number of times
* guess and check --> successive approximation, among which is bisection search
iteration programs: programs now take time that depends on the variable
classes of algorithms. one useful example: guess and check
* example: find cube root of a given number
* guess and check methods can work on problems with a finite number of possibilities. exhaustive enumeration is a good way to generate guesses in an organized manner
* while loops generally iterate over a sequence of choices; for loops (identifier, sequence, code block)
* float point numbers representation: decimal number (human use). computer: binary number. 

* when converting fractions into binary number, the strategy is find a number p that x*(2**p) is a whole number. if there's no such integer p, then internal representation of the fraction number is always an approximation --> float numbers are not "exact"
* approximate solutions: can't guarantee exact answer, just something close enough ---> start with enumerative exhaustion
* code example: pick a step size, start point, number of guesses, test. in general, takes x/step times to find the solution. step too big, miss the solution; step too small, takes a long time.
* bisection search: pick a middle point -> check too big, or small -> pick a new middle point in the new direction. should work well on problems with "ordering" property - value of function being solved varies monotonically with input value
use math theorem to generate guesses: Newton-Ralphson. 
