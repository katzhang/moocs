def isIn(char, aStr):
    '''
    char: a single character
    aStr: an alphabetized string
    
    returns: True if char is in aStr; False otherwise
    '''
    mid = len(aStr)/2;
    if len(aStr) == 1 and aStr != char:
        return False;
    elif char == aStr[mid]:
        return True;
    elif char < aStr[mid]:
        return isIn(char, aStr[:mid]);
    elif char > aStr[mid]:
        return isIn(char, aStr[mid:]);
        
print isIn('i', 'i');