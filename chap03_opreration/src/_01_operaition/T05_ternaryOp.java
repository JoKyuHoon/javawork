package _01_operaition;

import java.util.Scanner;

public class T05_ternaryOp {

	public static void main(String[] args) {
		
		
		// 삼항연산자
		/*
		 조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
		   1         2               3      >>    3항
		*/
		
		int num1 = 10;
		int num2 = 7;
		
		String result = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다"; // >> 문자열이 들어가기 때문에 String
		System.out.println(result);
		
		System.out.print("num2의 숫자는 ");
		char re1 = num1 < num2 ? '소' : '대'; // > 문자 1개가 들어가기 때문에 char
		System.out.println(re1);
		
		int num3 = -8;
		int re2 = num3 < 0 ? -num3 : num3;
		System.out.println(re2);
		// num3의 값을 절대값으로 변경하기
		
		
		
		
		
		
		//사용자로부터 점수를 입력받아 80점 이상이면 합격 그렇지 않으면 불합격 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("점수를 입력하시오 : ");
		
		int score = scan.nextInt();
		
	    String re3 = score >= 80 ? "합격" : "불합격";
	    
	    System.out.println("시험에 " + re3 + "했습니다.");
	    
	    
	    String re4 = 
	    	score > 100 ? "잘못입력했습니다." :
	    	score >= 90 ? "A학점" :
	    	score >= 80 ? "B학점" :
	    	score >= 70 ? "C학점" :
	    	score >= 60 ? "D학점" :
	    	score < -1  ? "잘못입력했습니다." : "F학점";
	    		
//	        score > 100 ? "잘못입력했습니다" :
//	        score >= 90 ? "A학점" : 
//	        score >= 80 ? "B학점" :
//	        score <= 79 ?  "C학점": "잘못입력했습니다.";
	    			 
		                           
	    System.out.println(re4);
		
		
		
		
		
		
			
	}

}
