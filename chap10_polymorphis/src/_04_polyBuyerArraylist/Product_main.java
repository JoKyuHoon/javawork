package _04_polyBuyerArraylist;

public class Product_main {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		GameDevice gd = new GameDevice();
		GameDevice gd2 = new GameDevice();
		

		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(gd);
		b.buy(gd2);
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈 : " + b.money + "만원");
		System.out.println("보너스 점수 : " + b.bonusPoint + "점");

		

		b.getInfo();
		b.refund(gd);
		
	}

}


