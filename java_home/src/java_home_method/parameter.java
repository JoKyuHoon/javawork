package java_home_method;

public class parameter { // parameter (전달값)

	public static void print() { // << 전달값이 없는 메소드
		System.out.println("안녕하세욬");
}
	
	public static void print(int a) { // << 전달값이 없는 메소드
		System.out.println(a);
}
	 
	public static void main(String[] args) {
		print(3);
		print(10);
		print();
		
	}
	
	
	
}
