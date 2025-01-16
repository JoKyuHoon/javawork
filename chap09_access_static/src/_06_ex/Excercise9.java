package _06_ex;

public class Excercise9 {

	
	public static void main(String[] args) {
		
	
	
	Excercise ex1 = Excercise.getIntance();
	Excercise ex2 = Excercise.getIntance();
	
	System.out.println("ex == ex : " + (ex1 == ex2));
		
		
	}
}


class Excercise {
	
	private static Excercise excercise = new Excercise();
	
	public static Excercise getIntance() {
		return excercise;
	}


	}
	

