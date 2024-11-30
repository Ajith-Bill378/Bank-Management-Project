package in.bank;

public interface Account {
	
	void withdraw(int money,int pin);
	void deposite(int money,int pin);
	String userDetails(int pin);
	void checkBalance(int pin);
	

}
