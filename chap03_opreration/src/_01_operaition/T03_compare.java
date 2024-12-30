package _01_operaition;

public class T03_compare {

	public static void main(String[] args) {
		// 비교연산자(같은가) : ==
        //        (다른가) : !=
		
		int num1 = 10;  // >> 대입연산자
		int num2 = 50;
		
		boolean re1 = num1 == num2;
		System.out.println("num1과 num2가 값이 같습니까? : " + re1);
		
		System.out.println("num1과 num2가 값이 같습니까? : " + (num1 == num2)); // 괄호가 들어가야함
		
		System.out.println("num1과 num2가 값이 다릅니까? : " + (num1 != num2));
		
		

	}

}
