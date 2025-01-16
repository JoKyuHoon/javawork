package java_home_method;

public class 변수의범위 {

	public static void scope() {
		int b = 20;
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {
//		System.out.println(b); // 사용 불가
		
		int c = 30;
		if(c > 10) {
			int d = 40;
			System.out.println(d);
		}
//		System.out.println(d); << {} 중괄호를 벗어났기때문에 여기서 사용 불가능
		
		
	}
 
}
