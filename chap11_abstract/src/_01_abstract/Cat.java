package _01_abstract;
/*
 * 추상클래스를 상속받은 클래스는 반드시 추상메소드를 구현해야 한다
 * 추상메소드에 구현할 내용이 없다면 내용을 비우더라도 작성해야한다
 */
public class Cat extends Pet {

	Cat() {
		 this("페르시안","흰색","지밖에모름");
	}
	
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
		
	}
/*
	@Override
	void sound() {
	// 내용이 비어있더라도 반드시 만들어야함
		
	}
*/
	@Override
	void sound() {
		System.out.println("야옹");
	}
	
	
	
}
