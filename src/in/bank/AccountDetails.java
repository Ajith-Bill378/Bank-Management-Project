package in.bank;

public class AccountDetails {
	
	public String name;
	public  int accNo;
	public double balance;
	public AccountDetails(String name, int accNo, double balance) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountDetails [name=" + name + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	

}
