balance = 3329;
annualInterestRate = 0.2;

step = 10;
payment = 0;
epsilon = 0.01;

while balance > epsilon:
    payment += step;
    for i in range(1, 13):
        balance = round((balance - payment) * (1 + annualInterestRate/12.0),2);
        
print payment;