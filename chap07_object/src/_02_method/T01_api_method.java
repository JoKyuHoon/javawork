package _02_method;

public class T01_api_method {
    // 메소드(기능) : 
	
	// 1. 반환형이 없는 메소드
	//    void 메소드명() {실행할 구문}
	// 객체를 만들어 메소드를 호출했을 때 변수에 저장 할수 없음
	// 객체를 만들어 메소드를 호출했을 때 출력문에 넣을 수 없음
	
	
	void print1() {
		System.out.println("1반환값이 없고 매개변수도 없는 메소드");
		
	}
		
	//2. 반환형이 있는 메소드
	/*   반환형 메소드명() {
		실행할 구문; return 반환형과 자료형이 같은 값(int면 return도 int);
		}	
	*/
	int print2() {
		System.out.println("2반환형이 int이고 매개변수는 없는 메소드");
		int num = 5;
		return num + 5;
		}
	String print3() {
		System.out.println("3반환형이 String이고 매개변수는 없는 메소드");
		return "반환되는 문자";
	}
	
	boolean print4() {
		System.out.println("4반환형이 boolean이고 매개변수는 없는 메소드");
		return true;
	}
		
	// 매개변수	
	// 메소드 호출시 반드시 입력해야 하는 값
	
	void print5(int x) {
	//          매개변수   
		System.out.println("5반환형이 없고 매개변수가 1개인 메소드");
		System.out.println("x = " + x);
	}
	
	int print6(int x, int y) {
		System.out.println("6반환형은 int이고 매개변수가 2개인 메소드");
		int sum = x+y;
//		↕같음
		return sum;
	}
	
	void print7(String str, int num) {
		System.out.println("7입력한 문자 : " + str);
		System.out.println("7입력한 숫자 : " + num);
	}
		
	
	
	
	
	}
	
		
	
	

