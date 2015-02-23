vowels = 'aeiouAEIOU';
count = 0;

for char in s:
    for v in vowels:
        if char == v:
            count += 1;
            
print 'Number of vowels: ', count;