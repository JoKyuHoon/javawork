package chap02_variable;

import java.util.Scanner;

public class Scanner_06report {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("정수 2개 입력(띄어쓰기로) >> ");
		int num3 = 7;
		int num4 = 5;
		
//		int num3 = scan.nextInt();
//	    int num4 = scan.nextInt();
		
//		System.out.println(num3 + "+" + num4 + "=" + (num3+num4));
//		System.out.println(num3 + "-" + num4 + "=" + (num3-num4));
//		System.out.println(num3 + "*" + num4 + "=" + num3*num4);
//		System.out.println(num3 + "/" + num4 + "=" + num3/num4);
		
		System.out.print("연산자를 입력하세요 : ");
		char op = scan.next().charAt(0);
		if(op == '+')
			System.out.println(num3 + op + num4 + "=" + (num3+num4));
	    else if(op == '-')	
			System.out.println(num3 + op + num4 + "=" + (num3-num4));
		else if(op == '*')	
			System.out.println(num3 + op + num4 + "=" + (num3*num4));
		else if(op == '/')	
			System.out.println(num3 + op + num4 + "=" + (num3/num4));
		
	}

}
