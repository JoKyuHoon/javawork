package _08_interfacePolymorphism;

public class Game implements Product {
	boolean power;
	
	
	
	void changeGame(String gameName) {
		System.out.println(gameName + "로 전환합니다.");
		
		
	}

	@Override
	public void power() {
		power = !power;
		if(power)
			System.out.println("전원을 켭니다");
		else
			System.out.println("전원을 끕니다");
		
	}

	@Override
	public int volume(int volume) {
		
		return volume;
	}
	
	public int channel(int channel) {
		return channel;
	}
	
	@Override
	public String toString() {         //  class의 최상위 클래스 object에 있는 메소드
		return "game";
	}
	
	
}
