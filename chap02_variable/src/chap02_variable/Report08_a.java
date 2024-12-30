package chap02_variable;

import java.util.Scanner;

public class Report08_a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kor = scan.nextInt();
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		System.out.print("컴퓨터 점수 : ");
		int com = scan.nextInt();
		
		int sum = kor + math + com;
		double avg = sum / 3.0;
		
		System.out.println("total : " + sum);
		System.out.printf("avg   : %.2f", avg);
		

	}

}
