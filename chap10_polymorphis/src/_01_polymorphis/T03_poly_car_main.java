package _01_polymorphis;
class Car {
	String color;
	int speed;
	void drive() {
		System.out.println("운전중");
	}
	void stop() {
		System.out.println("멈춤");
	}
}

class FireCar extends Car {
	void water() {
		System.out.println("물을 뿌립니다");
	}
}
public class T03_poly_car_main {

	public static void main(String[] args) {
		FireCar fc1 = new FireCar();
		fc1.drive();
		fc1.water();
		fc1.stop();

		Car car = fc1;
		car.drive();
		car.stop();
//		car.water();  << 사용불가능 
		// 강제 형변환 : 부모타입을 자식타입으로 강제 형변환
		FireCar fc2 = (FireCar)car;

		/*
		 * 
		 * 부모는 반드시 최초객체생성시 자식 타입으로 객체가 생성되어 있어야만 가능함
		 */

		Car car2 = new Car();
//		FireCar fc3 = (FireCar)car2; // 컴파일 오류(실행시 오류 발생)
		
		// instanceof : 좌측의 객체가 우측의 타입으로 만들어 졌는지 검사(true)
		if (car2 instanceof FireCar) {
			FireCar fc3 = (FireCar)car2;
		}else {
			System.out.println("변환할 수 없음");
		}
		
		
		Car car3 = new FireCar();
		System.out.println("프로그램 종료");
		
		if(car3 instanceof FireCar) {
			FireCar fc4 = (FireCar)car3;
			System.out.println("");
		}else {
			System.out.println("변환할 수 없음");
		}
		
	
	}
	
		
		
		

	

}
