##Lecture-2: Analysis of algorithms
* key factor: running time
* primary practical reason: avoid performance bugs
* some algorithmic success: FFT algorithm
* how to time a program? watch, java's Stopwatch
* doubling hypothesis: quick way to estimate b in a power-law relationship
    * run program, doubling the size of the input, running time is about aN^b with b = lg ratio
* mathematical models
    * we can get average of time cost for basic operations on a certain hardware system
    * in java string concatenation is proportional to string length, not constant
    * simplifying the calculations: 1. cost model: use some basic operations as a proxy for running time
                                    2. tilde notation: when n is large, discard lower order terms
                                    
    * in principle: accurate math models are available; in practice, use approximate models (cost model, tilde notation)
    
* order of growth classifications
    * common types: 1, log n, n log n, n^2, n^3, 2^n
    
* analysis: best case, worst case, average case
* commonly used notations: Big Theta, Big Oh, Big Omega
* upper bound: find a specific algorithm; lower bound: proof that no algorithm can do better
* algorithm design approach: develop an algorithm, prove a lower bound; gap? lower the upper bound (discover a new algorithm, raise the lower bound)
* common mistake: interpreting big O as an approximate model (which actually is used to find upper bounds)

* memory
    * megabyte: 2^20 bytes
    * modern machine: 64 bit machine with 8 byte pointer
    * typical memory usage for primitive types and arrays and objects

    
    