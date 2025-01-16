package _01_abstract;

 public class Dog extends Pet {

	Dog() {
		 this("똥개","누런색","똥잘쌈");
	}
	
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
		
	}

	@Override
	void sound() {
		System.out.println("왈");
	}
	/*
	@Override
	void sound() {
	// 내용이 비어있더라도 반드시 만들어야함
		
	}
	*/
	
}
