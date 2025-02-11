package _02_static;
/*
 * 1. 지역변수 : 중괄호 안에서만 사용 가능 중괄호를 빠져나오면 저장공간은 사라짐(for문안, 메소드안, ...)
 * 2. 인스턴스 변수 : 클래스 바로 안에 선언(객체가 만들어질 때 저장공간이 마련됨)
 * 3. 정적변수(글로벌변수, static변수) : 모든 객체가 공통으로 사용하는 값
 *    : 클래스가 올라오는 저장공간(메소드공간)에 변수의 저장공간이 마련됨
 */

public class T01_static {
	// 인스턴스 속성(=변수=필드)
	int num = 5;
	String name = "이턴스";
	
	//정적 필드
	static int numSt = 10;
	static String nameSt = "박정적";
	
	// 인스턴스 메소드
	// 인스턴스 메소드를 호출한다는 것은 객체를 생성했다는 의미
	void printIn() {
		System.out.println("인스턴스 메소드");
		System.out.println(name);
		System.out.println(numSt); // 정적필드
	}
	
	// 정적 메소드
	// 정적 메소드 호출시 객체를 생성하지 않고도 호출가능
	static void printSt() {
		System.out.println("정적 메소드");
		System.out.println(nameSt); // 정적필드 사용가능
//		System.out.println(num);  << 인스턴스필드 사용 불가능
		// 인스턴스필드는 반드시 객체가 생성되어야 저장공간 확보
		// 반드시 객체가 생성되었다는 전재가 없어서 사용 못함
		
		
	}
	
}
