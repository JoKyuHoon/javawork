package _01_abstract;

 public class Frog extends Pet {

    Frog() {
		 this("개구리","초록색","파리 좋아함");
	}
	
	Frog(String kind, String color, String feature) {
		super(kind, color, feature);
		
	}

	@Override
	void sound() {
		System.out.println("개굴");
	}
	/*
	@Override
	void sound() {
	// 내용이 비어있더라도 반드시 만들어야함
		
	}
	*/
	
	
	
}
