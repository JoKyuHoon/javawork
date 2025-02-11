package chap02_variable;

import java.util.Scanner;

public class Scanner_06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//                     객체   클래스    매개변수
		
		// 사용자에게 무엇을 해야되는지 써주는것이 좋다
		System.out.print("정수 입력 : ");
		// 정수형(int)으로 받을때 nextInt()
		int num1 = scan.nextInt();
		System.out.println("입력받은 값 : " + num1);
		
		System.out.print("이름 입력 : ");
		// 문자열로 받을 때 next()
		String name = scan.next(); // 1개의 문자열 : 스페이스바가 없는곳까지
		System.out.println("이름 : " + name);
		
		System.out.print("당신은 학생입니까? : ");
		boolean student = scan.nextBoolean(); // true or false / 한글로 하고 싶을 때 : String을 사용(네, 아니오)
		System.out.println("당신의 답은 : " + student);
		
		// 실수형으로 받을 때 nextDouble()
		// 문자열의 한 문장을 얻어올 때 nextLine() : 엔터를 칠때까지
		scan.nextLine();
		System.out.print("주소입력 : ");
		
		// 23줄의 엔터가 들어옴 nextLine()을 중간에 사용할 때는 한번 더 써줘서 앞에 엔터를 넣어줌
		// 혹은 맨 첫줄에 넣을때는 상관없음
		String address = scan.nextLine();
		System.out.println("주소는 : " + address);
		
		System.out.print("성의 이니셜 1글자 입력 : ");
		char initial = scan.next().charAt(0);
        //			   abcde       charAt(0) = a
		//			               charAt(1) = b
		//			   문자열 : 1글자 이상
		System.out.println("성의 이니셜은 : " + initial);
		
    
		/*
		 * System.out.println("정수 3개 입력(띄어쓰기로) >> "); 
		 * int num1 = scan.nextInt(); 
		 * int num2 = scan.nextInt(); 
		 * int num3 = scan.nextInt();
		 * System.out.println("첫번째 숫자 : " + num1); 
		 * System.out.println("두번째 숫자 : " + num2);
		 * num2); System.out.println("세번째 숫자 : " + num3);
		 */
		
		//레포트
		/*
		 * 1. 사용자로부터 2수를 입력받아
		 *    사칙연산을 출력하시오.
		 * 2. 사용자로부터 연산자(1글자)를 입력받아
		 *    위 1번의 두 수를 연산하여 출력하시오.
		 *    
		 *    입력받음 : 7 5  
		 *    7+5=12
		 *    7-5=2
		 *    7*5=35
		 *    7/5=1 
		 *    
		 *    ex) 입력받은 : *
		 *        7*5=35
		 *    
		 *    
		 */
	
		
//		System.out.println("정수 2개 입력(띄어쓰기로) >> ");
//		int num3 = 7;
//		int num4 = 5;
//		
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		
//		System.out.println(num3 + "+" + num4 + "=" + (num3+num4));
//		System.out.println(num3 + "-" + num4 + "=" + (num3-num4));
//		System.out.println(num3 + "*" + num4 + "=" + num3*num4);
//		System.out.println(num3 + "/" + num4 + "=" + num3/num4);
//		
//		System.out.print("연산자를 입력하세요 : ");
//		char op = scan.next().charAt(0);
//		if(op == '+')
//			System.out.println(num3 + op + num4 + "=" + (num3+num4);
//		else if(op == '-')	
//			System.out.println(num3 + op + num4 + "=" + (num3-num4);
//		else if(op == '*')	
//			System.out.println(num3 + op + num4 + "=" + (num3*num4);
//		else if(op == '/')	
//			System.out.println(num3 + op + num4 + "=" + (num3/num4);
//		
		
		
}
}