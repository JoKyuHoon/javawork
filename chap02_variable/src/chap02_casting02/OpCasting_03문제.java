package chap02_casting02;

import java.util.Scanner;

public class OpCasting_03문제 {

	public static void main(String[] args) {
	 
		// 1. 문자 하나를 입력받아 그 문자의 유니코드를 출력하기
//		Scanner scan = new Scanner(System.in);
//		System.out.print("문자 1개 입력 : ");
//		char ch = scan.next().charAt(0);
//		
//		int chUni = ch2;
//		System.out.println(ch + "의 유니코드 : " + chUni);
//		
		 
		
		  
		  int iNum1 = 10;
		  int iNum2 = 4;
	      float fNum = 3.0f;
		  double dNum = 2.5;
	      char ch2 = 'K'; 
	      
//		   3.1  iNum1 / iNum2의 몫 출력
	       System.out.println(iNum1 + "/" + iNum2 + "의 목 : " + iNum1 / iNum2);
	       
//		   3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
	       double result = iNum2 * dNum;
	       System.out.println(iNum2 + "*" + dNum + " = " + result);
	       
//		   3.3  iNum1의 값이 10.0으로 출력되게 하기
	       System.out.println((double)iNum1);
	       
//		   3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
	       System.out.println((double)iNum1 / iNum2);
	       
//		   3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
	       float flo = iNum1 / fNum;
	       System.out.println((int)flo);
	       //System.out.println(iNum1 / (int)fNum); // float이 더 크기 때문에 (int)를 float 앞에 넣어야함.
	       
//		   3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
	       double result3 = iNum1 / (double)fNum;
	       System.out.println(result3);
	       
//		   3.7  ch2변수의 유니코드 출력하기
	       System.out.println((int)ch2);
//	       int result4 = (int)ch2;
	       
//		   3.8  ch2변수에 1을 더해 L 이 출력되게 하시오
	       int ch3 = ch2 + 1 ;
	       char ch4 = (char)(ch2+1);
	       System.out.println((char)ch3);
	       System.out.println(ch4);

	}

}
