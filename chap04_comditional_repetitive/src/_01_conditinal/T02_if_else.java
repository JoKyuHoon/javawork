package _01_conditinal;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		/*
		 if(조건식) {
		    조건식이 참일 때 실행할 구문
		    } else {
		      조건식이 거짓일 때 실행할 구문
		    }
		     */
		
		int score = 65;
		if (score >= 70) {     //  <<  score는 70이상이기 때문에 else구문이 출력됨
			System.out.println("축하합니다");
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
			System.out.println("다음 기회에ㅋ");
		}

		System.out.println("-------------------");
		
		if(score >= 70) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
		
		int num1 = -100;  //  양수인지 음수인지 출력
		if (num1 >= 0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		
		// 사용자로부터 정수를 입력받아 짝수인지 홀수인지 구분하시오
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요 : ");
//		int num2 = scan.nextInt();
//		if (num2 % 2 == 0) {
//			System.out.println("짝수입니다");
//		}else {
//			System.out.println("홀수입니다");
//		}
		
		
		
		
		
		
		
		
		
		
	}

}
