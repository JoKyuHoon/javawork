package _07_ex;

public class Product_main {

	public static void main(String[] args) {
		
		Game g = new Game();
		
		System.out.print(g);  // << g의 주소가 나와야 하는데  toString을 했기 때문에 game으로 출력
		g.power();
		System.out.println("볼륨 : " + g.volume(5));
		g.changeGame("lol");
		System.out.print(g);
		g.power();
		
		System.out.println("-------------------------------");
		
		Tv t = new Tv();	
		t.power();
		System.out.println("볼륨 : " + t.volume(10));
		System.out.println("채널 : " + t.channel(5));
		
		System.out.println("-------------------------------");
		g.search("롤체");
		t.search("JAVA");
		
		
		Product.AIspeak("아악");

	}

}
