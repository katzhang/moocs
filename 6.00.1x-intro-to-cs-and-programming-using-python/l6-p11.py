def biggest(aDict):
    '''
    aDict: A dictionary, where all the values are lists.

    returns: The key with the largest number of values associated with it
    '''
    record = 0;
    recordKey = None;
    for key in aDict:
        if len(aDict[key]) >= record:
            record = len(aDict[key]);
            recordKey = key;
            
    return recordKey;
            
        