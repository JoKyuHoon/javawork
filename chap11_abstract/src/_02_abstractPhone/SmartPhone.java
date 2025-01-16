package _02_abstractPhone;

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
	
@Override
void hangUp() {
	System.out.println("화면을 터치해 전화받음");
}
@Override
void hangOut() {
	System.out.println("화면을 터치해 전화끊음");
}
	
}
