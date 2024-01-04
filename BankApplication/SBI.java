package BankApplication;
public class SBI implements Bank{
   static int balance=10000;
@Override
public int Balance() {
	// TODO Auto-generated method stub
	return balance;
}

@Override
public String transfer(int amount,long number) {
	if(balance<amount) {
		return "Insufficient Balance";
	}
	balance=balance-amount;
	return "Successfully "+ amount +" Transfer to number: "+number+ "and\nRemaining amount is "+balance;
}

@Override
public int Deposit(int amount) {
	// TODO Auto-generated method stub
	balance=balance+amount;
	return balance;
} 
}
