package _04_Math;

// Math클래스 : 수학에서 쓰는것을 메서드로 만들어 놓음
//            클래스 안의 모든 필드와 메서드는 static이 붙어있음

public class T01_Math {

	public static void main(String[] args) {
		// 절대값 : abs
		System.out.println("-15의 절대값 : " + Math.abs(-15));
		System.out.println("15.8751의 절대값 : " + Math.abs(15.8751));
		
		// 소수점이하 무조건 큰숫자로 올림 : ceil()
		System.out.println("13.1의 올림 : " + Math.ceil(13.1));
		System.out.println("-13.1의 올림 : " + Math.ceil(-13.1));
		
		// 소수점이하 무조건 작은내림 : floor()
		System.out.println("13.7의 내림 : " + Math.floor(13.7));
		System.out.println("-13.7의 내림 : " + Math.floor(-13.7));
		
		// 가장 가까운 정수로 반환 : rint()
		System.out.println("13.1의 가까운 정수값 : " + Math.rint(13.1));
		System.out.println("13.7의 가까운 정수값 : " + Math.rint(13.7));
		System.out.println("13.5의 가까운 정수값 : " + Math.rint(13.5));
		System.out.println("-13.1의 가까운 정수값 : " + Math.rint(-13.1));
		System.out.println("-13.7의 가까운 정수값 : " + Math.rint(-13.7));
		
		// 소수점 이하 반올림 : round()
		System.out.println("13.1을 반올림 : " + Math.round(13.1));
		System.out.println("13.7을 반올림 : " + Math.round(13.7));
		System.out.println("-13.1을 반올림 : " + Math.round(-13.1));
		System.out.println("-13.7을 반올림 : " + Math.round(-13.7));
		
		// 소수점 2째자리까지 얻기
		double value = 12.34567;
		double value2 = value * 100;
		System.out.println(Math.round(value2) / 100.0);
		System.out.println("--------------------");
		
		// 두 수중 큰수 or 작은수 : max(), min() 
		System.out.println("7과 5중 큰수 : " + Math.max(7, 5));
		System.out.println("7과 5중 작은수 : " + Math.min(7, 5));
		System.out.println((char)Math.max('a','z'));
		
		// 제곱연산 : pow()
		System.out.println("5의 3승 : " + Math.pow(5, 3));
		System.out.println("1024의 2승 : " + Math.pow(1024, 2));
		
		// 제곱근 : sqrt()
		System.out.println("25의 제곱근 : " + Math.sqrt(25));
		System.out.println("81의 제곱근(정수형) : " + (int)Math.sqrt(81));
		System.out.println("80의 제곱근 : " + Math.sqrt(80));
		
		
		
		
	}

}
