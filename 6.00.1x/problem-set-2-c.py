balance = 3329;
annualInterestRate = 0.2;
monthlyRate = annualInterestRate / 12.0;

lo = balance / 12.0;
hi = balance * (1 + (1 + monthlyRate)**12) / 12.0;
epsilon = 10;

payment = (lo + hi) / 2;

while abs(balance) >= epsilon:
	for i in range(1, 13):
		balance = (balance - payment) * (1 + annualInterestRate/12.0);
	if balance > 0:
		lo = payment;
	else:
		hi = payment;

print lo;
print hi;
 
print payment; 