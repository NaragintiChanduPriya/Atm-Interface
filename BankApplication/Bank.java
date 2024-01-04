package BankApplication;
public interface Bank {
	int Balance();
	String transfer(int amount,long number);
	int Deposit(int amount);

}
