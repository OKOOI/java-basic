package oop1.ex;

public class Account {

	int balance; //잔액
	
	void deposit(int amount) {
		balance += amount;
	}
//	int deposit(int amount) {
//		balance = balance + amount;
//		return balance; 
//	}
	
	void withdraw(int amount) {
		if(balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("잔액부족");
		}
	}
//	int withdraw(int amount) {
//		if(balance >= amount) {
//			balance = balance - amount;
//			return balance; 			
//		} else {
//			System.out.println("잔액부족");
//			System.out.println("잔고: " + balance);
//			return balance;
//		}
//	}
	
}
