print 'Please think of a number between 0 and 100!';

low = 0;
high = 100;
ans = (low + high)/2;

direction = '';

while direction != 'c':
    print 'Is your secret number ', ans, '?';
    direction = raw_input('Enter \'h\' to indicate the guess is too high. Enter \'l\' to indicate the guess is too low. Enter \'c\' to indicate I guessed correctly.');
    
    if direction == 'l':
        low = ans;
        ans = (low + high)/2;
    elif direction == 'h':
        high = ans;
        ans = (low + high)/2;
    elif direction == 'c':
        print 'Game over. Your secret number was: ', ans;
    else:
        print 'Sorry, I did not understand your input.'