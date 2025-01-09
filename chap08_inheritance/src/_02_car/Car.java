package _02_car;

public class Car {
	public	String model;   // = 스타렉스
	public	String company; // = 현대
	public	boolean power;
	public	int speed;
	
//   ↓ 생성자
	Car(String model, String company) {
		this.model = model;
		this.company = company;
		
	}
	void power() {
		if(power = !power)
			System.out.println("시동이 걸렸습니다.");
		else
			System.out.println("시동이 꺼졌습니다.");
		
	}
	int speedUp() {
		speed += 5;
		return speed;
		
	}
	int speedDown() {
		speed -= 5;
		return speed;
	}
	
	
}
