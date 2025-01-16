package _08_interfacePolymorphism;

public class Tv implements Product {
	boolean power;
	

	
	

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
	
	@Override
	public int channel(int channel) {
		
		return channel;
	}
	
	
	@Override
	public void search(String search) {
		System.out.println(search + "를 유튜브에서 검색합니다.");
	}
	
	@Override
	public String toString() {         //  class의 최상위 클래스 object에 있는 메소드
		return "tv";
	}
	
	}
	
	
	

