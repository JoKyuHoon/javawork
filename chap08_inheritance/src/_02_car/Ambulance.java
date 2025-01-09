package _02_car;

public class Ambulance extends Car {
	public	Ambulance(String model, String company) {                  
		super(model, company); // super : 부모의 생성자 호출         
		
	}

	boolean siren;
	public	void siren() {
		if(siren = !siren)
			System.out.println("siren 작동");
		else
			System.out.println("siren 멈춤");
	}

	public	void firstAid() {
		System.out.println("응급처치를 합니다");
	}
	
	
}
