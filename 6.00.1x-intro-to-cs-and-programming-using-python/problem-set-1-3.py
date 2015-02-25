alphabet = 'abcdefghijklmnopqrstuvwxyz';
count = 1;
record = 0;
start = 0;
s = 'azcbobobegghakl';
substring = '';

for i in range(0, len(s) - 1):
    if (alphabet.index(s[i]) <= alphabet.index(s[i+1])):
        count += 1;
    else:
        if count > record:
            record = count;
            substring = s[i - record + 1 : i + 1];
            count = 1;
            
print 'Longest substring in alphabetical order is: ', substring;
    