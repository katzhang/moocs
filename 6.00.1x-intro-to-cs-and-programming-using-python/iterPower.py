def iterPower(base, exp):
    '''
    base: int or float.
    exp: int >= 0
 
    returns: int or float, base^exp
    '''
    result = 1;
    while exp > 0:
        result *= base
        exp -= 1;
    return result;
    
    
result = iterPower(12,2);
print result;