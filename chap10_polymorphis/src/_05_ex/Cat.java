package _05_ex;

public class Cat extends Pet {

	Cat() {
		 this("페르시안","흰색","지밖에모름");
	}
	
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
		
	}

	@Override
	void sound() {
		System.out.println("야옹");
	}
	
	
	
}
