package _03_polyBuyerArray;

public class Computer extends Product {

	Computer(){
		super(120);
	}
	@Override
	public String toString() {
		return "Computer";
	}
	
}

//	Compurer c = new Computer();
//	system.out.println(c) -> toString() 호출  return << 패키지이름.클래스이름@주소 가 들어감
