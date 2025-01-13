package _02_userException;

public class ex {

	public static void main(String[] args) {
	
	public void add(int a, int b) {
		if(a<0 && b<0)
			System.out.println(a+b);
			
		else
			throw new UserException();
	}
	
		
	
	
	
	
	}
}