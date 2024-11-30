package in.bank;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User user=new User("kishor",123456,1200.84);
		menu();
		try {
			switch (sc.nextInt()) {
			case 1:
				try {
					System.out.println("Enter The money");
					int money=sc.nextInt();
					System.out.println("Enter The PIN");
					user.withdraw(money, sc.nextInt());
				} catch (Exception e) {
					System.out.println("Please Valid Amount");
				}
				break;
			case 2:
				try {
					System.out.println("Enter the pin");
					user.checkBalance(sc.nextInt());
				} catch (Exception e) {
					System.out.println("Wrong Key Pressed");
				}
				break;
			case 3:
				try {
					System.out.println("Enter money");
					int money=sc.nextInt();
					System.out.println("Enter pin");
					user.deposite(money, sc.nextInt());
				} catch (Exception e) {
					System.err.println("Wrong key Pressed");
				}
				break;
			case 4:
				try {
					System.out.println("Enter PIN");
					String detai=user.userDetails(sc.nextInt());
					if (detai.equals("yes")) {
						System.out.println(user);
					} else {
						System.err.println("Wrong PIN");
					}
				} catch (Exception e) {
					System.out.println("Wrong key Pressed");
				}
				break;
			default:
				System.out.println("Enter above Options only");;
			}
		} catch (Exception e) {
			System.out.println("Invalid input");
		}
		
		
	}
	public static void menu() {
		System.out.println("1.withdraw\n2.check balance\n3.deposite\n4.Acc status");
	}

}
