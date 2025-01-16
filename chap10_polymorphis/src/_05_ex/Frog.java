package _05_ex;

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
	
	
	
}
