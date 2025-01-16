package _03_bank;



public class Bank {
	 
	
		
	private int balance;
	
	public void deposit(int money) {
		balance += money;
		System.out.println(money + "원이 입금되었습니다.");
	}
	
	public void withdraw(int money) {
		if(balance >= money)
			balance -= money;
			
		else
			System.out.println("잔액 부족");
	}
	
	public void getBanlance() {
		System.out.println("잔액 : " + balance);
	}
	/*
	int getBanlance() {
		return balance;
	}
	*/
	
		
}
	
	

