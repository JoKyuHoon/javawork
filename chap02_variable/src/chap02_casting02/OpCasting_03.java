package chap02_casting02;


public class OpCasting_03 {

	public static void main(String[] args) {
		//int보다 작은 자료형은 연산시 무조건 int형
		byte b1 = 10;
		short s1 = 5;
		
		int result = b1 + s1;
		byte result2 = (byte)(b1 + s1);
		System.out.println(result);
		
		// 리터널일때는 연산이 아니라 다음 글자를 의미
		char ch1 = 'A' + 1;
		System.out.println(ch1);
		
		// char ch = c1+1; // 오류
		int c1 = 51312;
		int ch = c1+1;
		char ch2 = (char)(c1+1);
		
		System.out.println(ch);
		System.out.println(ch2);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 / num2;
		System.out.println(result3);
		
		double result4 = num1/num2;
		System.out.println(result4);	
		
		double result5 = (double)num1 / num2;
		System.out.println(result5);
		
		
		
		
		
		//1.문자하나를 입력받아 그 문자의 유니코드를 출력하시오
		
		char ch4 = '훈';
		int int1 = ch4;
		
		System.out.println("훈의 유니코드 : " + int1);
		
		

		    int iNum1 = 10;
		    int iNum2 = 4;
		    float fNum = 3.0f;
		    double dNum = 2.5;
		    char ch3 = 'K'; 
		  // 3.1  iNum1 / iNum2의 몫 출력
		   int result6 = iNum1 / iNum2;
		   System.out.println(result6);
//		   3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
		   double result7 = (double) iNum2 * dNum;
		   System.out.println(result7);
//		   3.3  iNum1의 값이 10.0으로 출력되게 하기
		   System.out.println((double)iNum1);
//		   3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
		   double result8 = (double) iNum1 / iNum2;
		   System.out.println(result8);
//		   3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
		   
//		   3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
		   
//		   3.7  ch변수의 유니코드 출력하기
		   
//		   3.8  ch변수에 1을 더해 L 이 출력되게 하시오
		  
		   
		   
		   
	
		
		
		
		
		
		
	}

}
