def gcdIter(a, b):
    '''
    a, b: positive integers
    
    returns: a positive integer, the greatest common divisor of a & b.
    '''
    divisor = min(a,b);
    while not(a % divisor == 0 and b % divisor == 0):
        divisor -= 1;
        if divisor == 1:
            break;
            
    return divisor;
            
print gcdIter(36,18);