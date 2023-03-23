package com.maxtrain.bootcamp.banking;

public class Program {

	public static void main(String[] args) {
		
/*		try {
			var account = new Account();
			account.deposit(300);
			/* System.out.println("Balance is " + account.getBalance()); */
/*			account.withdraw(50);
			System.out.println("Balance is " + account.getBalance());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
*/

/*
 * try { var account = new Account(); account.deposit(100);
 * System.out.printf("Balance is %,7.2f\\n ", account.getBalance());
 * account.withdraw(50); System.out.printf("Balance is %,7.2f\n ",
 * account.getBalance());
 * 
 * var account2 = new Account(); account.transfer(20, account2);
 * System.out.printf("Account_1 is %,7.2f and Account_2 is %,7.2f%n ",
 * account.getBalance(), account2.getBalance());
 * 
 * } catch (Exception ex) { System.out.printf("EXCEPTION: %s\n",
 * ex.getMessage()); }
 */

		// deposit, withdraw, and transfer syntax
		try { 
			var account = new Account(); 
			account.deposit(100);
			System.out.printf("%s", account.toString()); 
			account.withdraw(50);
			System.out.printf("%s", account.toString());
  
			var account2 = new Account("2nd Account"); 
			account.transfer(20, account2);
			System.out.printf("%s%s", 
					account.toString(), account2.toString());
  
		} catch (Exception ex) { 
			System.out.printf("EXCEPTION: %s%n",
				ex.getMessage()); 
			}
 

		// syntax for interest rate
		try {
			var account = new Account("Account 1");
			account.deposit(1000);
			System.out.printf("%s", account.toString());
			account.withdraw(500);
			System.out.printf("%s", account.toString());
			
			var account2 = new Savings("Savings 1");
			account.transfer(100, account2);
			System.out.printf("%s%s", 
					account.toString(), account2.toString());
			account2.payInterest(3);
			System.out.printf("%s", account2.toString());
			
		} catch (Exception ex) {
			System.out.printf("EXCEPTION: %s%n", ex.getMessage());
		}

	
	}
}
