package _03_ex;

public class Phone {

	String model;
	String color;
	boolean bell;
	
	
	
	Phone(String model, String color) {
		this.model = model;
		this.color = color;
		this.bell = false;
	}
	void bell() {
		if(bell = !bell)
			System.out.println("벨울림");
		else
			System.out.println("벨꺼짐");
			
	}
	
	void hangUp() {
		System.out.println("전화를 받았습니다.");
	}
    void sendVoice(String message) {
    	System.out.println("나 : " + message);
    }
    void receiveVoice(String message) {
    	System.out.println("상대방 : " + message);
    	
    	
    }
	void hangOut() {
		System.out.println("전화를 끊었습니다.");
	}
	
	
}
