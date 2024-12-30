package _01_operaition;

public class T01_assignment {

	public static void main(String[] args) {
	    // % : 나머지
		int result = 10 % 3;
		System.out.println("10을 3으로 나눈 나머지 : " + result);
		
		result = result + 1;
//      result += 1; >> 10번줄과 같음 >> 주석처리를 안하면 result는 3이 됨.
		
		System.out.println("result + 1 = " + result);
		
		result *= 3;  // result = result * 3
		System.out.println("result * 3 = " + result);
		
		result -= 3;  // result = result - 3
		System.out.println("result - 3 = " + result);
		
		result /= 2;  // result = result / 2
		System.out.println("result / 2 = " + result);
		
		result = 7;
		System.out.println("result = " + result);
		
		result %= 5;  // result = result % 2 >> 나머지
		System.out.println("result % 5 = " + result);
		
		int num2 = 300_000_000; // _(언더바)는 보기 편하게 표시함. 출력되지않음
		System.out.println(num2);
		
		
	}

}
