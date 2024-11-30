package in.bank;

public class User extends AccountDetails implements Account {
    
	private int PIN=3225;
	public User(String name, int accNo, double balance) {
		super(name, accNo, balance);
		
	}
	
	@Override
	public void withdraw(int money,int pin) {
		if (balance>money && pin==PIN && money>=1) {
			this.balance-=money;
			System.out.println("Ur bal is now "+balance);
		}
		else if (money>balance && pin==PIN) {
			System.err.println("Insufficiant Funds");
		}else if (money<=0 && pin==PIN) {
			System.out.println("enter >1rs atleast");
		}else {
			System.err.println("Wrong PIN");
		}
	}

	@Override
	public void deposite(int money,int pin) {
		
		if (money>=0 && pin==PIN) {
			this.balance+=money;
			System.out.println("Ur Bal is "+balance);
		} else if (money<=1 && pin==PIN) {
			System.err.println("U have to enter the >1 rs");
		}else {
			System.err.println("Wrong PIN");
		}
		
	}

	@Override
	public String userDetails(int pin) {
		if (pin==PIN) {
			return "yes";
		}else {
			return "no";
		}
		
	}

	@Override
	public void checkBalance(int pin) {
		if (pin==PIN) {
			System.out.println("Ur balance is "+balance);
		}else {
			System.err.println("Incorrect Pin");
		}
		
	}

}
