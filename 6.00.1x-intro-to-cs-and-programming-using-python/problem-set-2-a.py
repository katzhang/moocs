balance = originalBalance = 4213;
annualInterestRate = 0.2;
monthlyPaymentRate = 0.04;

totalPaid = 0;
remaining = balance;

for i in range(1,13):
    print 'Month: ', str(i);
    print 'Minimum monthly payment: ', str(round(balance * monthlyPaymentRate,2));
    totalPaid += round(balance * monthlyPaymentRate,2);
    balance = balance * (1 - monthlyPaymentRate) * ( 1 + annualInterestRate / 12.0);
    print 'Remaining balance: ', str(round(balance, 2));
    
print 'Total paid: ', str(totalPaid);
print 'Remaining balance', str(round(balance, 2));
