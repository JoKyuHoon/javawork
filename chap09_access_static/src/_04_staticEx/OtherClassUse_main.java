package _04_staticEx;

// 클래스이름 : 패키지이름.클래스이름(클래스이름은 패키지이름.클래스이름이 원래 클래스 이름)
// 다른 package의 클래스를 사용하려면 import한 후 사용가능

import _03_bank.*;
import _02_car.*;

public class OtherClassUse_main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(9000);
		
		bank.withdraw(5000);
		
		bank.getBanlance();
	
		Ambulance ab = new Ambulance("조타렉스","현대");
		System.out.println(ab.model);
		System.out.println(ab.company);
		ab.siren();
	
	}

}
