count = 0;
bob = 'bob';
s = 'azcbobobegghakl';

for i in range(1, len(s) - 1):
    if s[i - 1 : i + 2] == bob:
        count += 1;
        
print 'Number of times bob occurs is:', count;