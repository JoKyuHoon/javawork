package _03_polyBuyerArray;

public class Buyer {

	int money = 1000;
	int bonusPoint;
	Product[] cart = new Product[10];
	int index = 0;
	
		void buy(Product p) {  //   b.buy(new Tv()) >> cart[0] = p
			if(money < p.price) {
				System.out.println("잔액부족");
				return;  // << 리턴 하면 메소드 빠져나옴.
			}
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart[index++] = p;
			System.out.println(p + "를 구입함");
			}
			
		void getInfo() {
			int sum = 0;
			String list = "";
			
		//	String list = "";
		
			for(int i=0; i<cart.length; i++) {
				if(cart[i]==null)
					break;
				sum += cart[i].price;
				list += (cart[i] + ", ");				
			}
			System.out.println();
			System.out.println("구입한 물품의 합계 : " + sum + "만원입니다.");
			System.out.print("구입한 물품 목록 :" + list);
		
				
	
		
	}
}
