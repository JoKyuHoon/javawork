package _08_interfacePolymorphism;
/* interface 다형성
 
 - interface는 객체생성 안됨
 - interface를 상속받은 클래스를 객체생성하여 그 객체를 interface타입으로 형변환
 
  
  
  
 */

public class Product_main {

	public static void main(String[] args) {
		// Product product = new Product(); interface는 객체생성 안됨
		
		Product product = new Game();
		System.out.print(product + "의 ");
		product.power();
		System.out.println(product.volume(7));
		
		System.out.println("--------------------------------");
		
		product = new Tv(); // >> 이미 생성된 product을 Game에서 Tv로 변경함. (*****변수 선언은 딱 한 번만 가능*****)
		System.out.print(product + "의 ");
		product.power();
		System.out.println(product.volume(3));
		
		

	}

}
