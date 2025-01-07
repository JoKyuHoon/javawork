package _03_ex;

public class Phone_main {

	public static void main(String[] args) {
		Phone  p1 = new Phone("아이폰14", "애플");

		
		p1.bell();
		p1.bell();
		p1.hangUp();
		p1.sendVoice("안녕하세요");
		p1.receiveVoice("그래");
		p1.hangOut();
		
		
		
		
		
	}

}
