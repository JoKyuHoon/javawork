package _02_polyBuyer;

public class GameDevice extends Product {

	GameDevice(){
		super(100);
	}
	@Override
	public String toString() {
		return "GameDevice";
	}

}

//	Compurer c = new Computer();
//	system.out.println(c) -> toString() 호출  return << 패키지이름.클래스이름@주소 가 들어감
