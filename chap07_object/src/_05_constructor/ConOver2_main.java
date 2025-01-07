package _05_constructor;

class ConOver2 {
	int num;	// 인스턴스 변수
	double dou;
	String name;
	
	// 다른 생산자 호출
	ConOver2(){
		this(1,1.0,"조규훈"); // 무조건 첫재줄에 넣어야 함.
//		num = 1;
//		dou = 1.0;
//		name = "조규훈";
		System.out.println("매개변수가 없는 생성자");			
	}
	
	ConOver2(int num){	 // 지역변수
		this(num,1.0,"조규훈");		
//		this.num = num;  // this : 니 자신의 객체
//		dou = 1.0;
//		name = "조규훈";
		
		System.out.println("매개변수가 1개인 생성자");
		
	}
	
	// 생성자에서 다른 생성자를 호출할 수 있다
	ConOver2(int num, double dou) {
		// 다른 생성자를 호출할 때는 첫번째 줄에 넣어야된다
		this(num, dou, "조규훈");
		this.num = num;
		this.dou = dou;
		name = "조규훈";
		System.out.println("매개변수가 2개인 생성자");
		
	}
	
	ConOver2(int num, double dou, String name) {
		this.num = num;
		this.dou = dou;
		this.name = name;
		System.out.println("매개변수가 3개인 생성자");
	}
	
	// 가변인자(int... num) : 들어올 인자(매개변수에 넣어줄 값)의 갯수를 모를 때 
	// (int... num) : 인자가 0개 이상
	// 반드시 들어와야 할 인자가 있다면 먼저 선언하고 가변인자는 맨 마지막에 넣는다
	
	void method(int... num) {
		System.out.println("인자가 0개 이상");
		for(int result : num) {
			System.out.println(result);
		}
		
		System.out.println("--------------------");
	}
	
//	void method3(String name, String address, String... str ) { }
//	void method3(int... num3, int num ) { } // 가변인자(int... num), (String... str)은 맨 끝에 넣어야 한다. 
	
	void method2(int num, int... num2) {
		System.out.println("인자가 1개 이상");
		System.out.println("첫번째 값 : " + num);
		System.out.println(num);
		for(int result : num2) {
			System.out.println(result);
		}
		System.out.println("--------------------");
	}
	
	void method3(String str, String... name ) {
		for(String n1 : name) {
			System.out.print(n1 + str);
			
		}
	}
	
	
	
}




public class ConOver2_main {

	public static void main(String[] args) {
		
		ConOver2 con = new ConOver2(5);
		
		System.out.println(con.num);
		System.out.println(con.dou);
		System.out.println(con.name);
		con.method();
		con.method(1);
		con.method(123415);
		
		con.method2(0);
		con.method2(5,6,7,8);
		
		//String[] names = {"조규훈", "조규호", "김동현", "방성환"};
		//con.method3(" / ", names);
		
		con.method3(" / ", "조규훈", "조규호", "김동현", "방성환");

	}

}






