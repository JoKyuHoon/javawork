package _02_userException;



public class Bank {
	 
	
		
	private int balance;
	
	public void deposit(int money) {
		balance += money;
		System.out.println(money + "원이 입금되었습니다.");
	}
	
	public void withdraw(int money) throws UserException {
		if(balance >= money)
			balance -= money;
			
		else
			throw new UserException("잔액부족 : " + (money-balance) + "모자람");
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
	
	

