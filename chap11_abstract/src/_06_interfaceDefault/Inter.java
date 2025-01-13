package _06_interfaceDefault;
/*
 * Interface 사이에서도 상속사능, 다중상속 가능
 */
interface Inter1 {
	int method1();
	static String stMe() {
		return "static 메소드";
		}
	
}
interface Inter2 {
	int method2();
	default String me2() {
		return "default 메소드2";
	}
}

public interface Inter extends Inter1, Inter2{
	int method();
	default String me() {  // public 생략 가능
		return "default 메소드";
	}
	
	
}
