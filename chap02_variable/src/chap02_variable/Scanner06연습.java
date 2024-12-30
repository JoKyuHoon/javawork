package chap02_variable;

import java.util.Scanner;

public class Scanner06연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num11 = scan.nextInt();
		System.out.println("답 : " + num11);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.println("이름 : " + name);
		
		System.out.print("학생이니? : ");
		boolean sd = scan.nextBoolean();
		System.out.println("답 : "+ sd);
		
		System.out.print("주소 : ");
		String address = scan.next();
		System.out.println("답 : " + address);
		
		System.out.print("성의 이니셜 1글자 : ");
		char i = scan.next().charAt(0);
		System.out.println("답 : " + i);
		
		

	}

}
