package _02_abstractPhone;

public class FolderPhone  extends Phone {

	FolderPhone(String model, String color) {
		super("실버폰", "은색");
		
	}

	
	@Override
	void hangUp() {
		System.out.println("핸드폰을 열어 전화 받음");
	}

	@Override
	void hangOut() {
		System.out.println("핸드폰을 닫아 전화 끊음");
	}

}
