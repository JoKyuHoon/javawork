package _02_abstractPhone;

abstract public class Phone {

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
	
abstract void hangUp();
    void sendVoice(String message) {
    	System.out.println("나 : " + message);
    }
    void receiveVoice(String message) {
    	System.out.println("상대방 : " + message);
    	
    	
    }
    
abstract void hangOut();
	
	
}
