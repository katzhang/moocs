def oddTuples(aTup):
    '''
    aTup: a tuple
    
    returns: tuple, every other element of aTup. 
    '''
    count = 0;
    result = ();
    for el in aTup:
        count += 1;
        if count % 2 != 0:
            result = result + (el,);
            
    return result;
    
print oddTuples(('I', 'am', 'a', 'test', 'tuple'));