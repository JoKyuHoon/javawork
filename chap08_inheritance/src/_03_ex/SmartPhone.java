package _03_ex;

public class SmartPhone extends Phone {

//	SmartPhone() {
//		this("애플","스그");  // 나의 다른 생성자를 호출
//	}
//	
	SmartPhone(String model, String color) {
		super(model, color);
		}
//	SmartPhone() {
//		super("애플","스페이스그레이");
//	}
	
	String search(String search) {
		System.out.println(search + "를 검색합니다.");
		return "검색완료";
	}
	
	
	
	
}
