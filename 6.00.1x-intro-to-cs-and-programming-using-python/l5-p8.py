def isIn(char, aStr):
    '''
    char: a single character
    aStr: an alphabetized string
    
    returns: True if char is in aStr; False otherwise
    '''
    if aStr == '':
        return False;
    
    if len(aStr) == 1 and aStr != char:
        return False;
    elif char == aStr[len(aStr)/2]:
        return True;
    elif char < aStr[len(aStr)/2]:
        return isIn(char, aStr[:len(aStr)/2]);
    elif char > aStr[len(aStr)/2]:
        return isIn(char, aStr[len(aStr)/2:]);
        
print isIn('i', 'i');