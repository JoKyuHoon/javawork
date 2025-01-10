package _04_interface2;

public class Inter_main  {

	public static void main(String[] args) {
		InterClass ic = new InterClass();
		ic.print(5);
		ic.inMethod();
		System.out.println(ic.PI);
		
//		ic.MAX = 100;
		
//		Inter in = new Inter(); >> 인터페이스는 객체를 생성할 수 없기 때문에 오류
//		ic.PI = 1.234; >> 상수라서 변경 못함
//		ic.MAX = 567;  >> 상수라서 변경 못함
		System.out.println(ic.add(5, 2));
		
	}

}
