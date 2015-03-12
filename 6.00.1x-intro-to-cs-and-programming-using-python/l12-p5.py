def genPrimes():
    '''generate prime number sequence'''
    primes = [];
    x = 1;
    
    while True:
        x += 1;
        isPrime = True;
        for p in primes:
            if x % p == 0:
                isPrime = False;
                break;
                
        if isPrime:
            primes.append(x);
            yield x;