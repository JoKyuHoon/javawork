package chap02_variable;

import java.util.Scanner;

public class Report_08 {

	public static void main(String[] args) {
		// 사용자로 부터 국어, 수학, 컴퓨터의 점수를 입력받아
		// 총점과 평균(소수점2자리까지(반올림) 출력
		
		
		
		/*
		 * double 국어 = 80; double 수학 = 82; 
		 * double 컴퓨터 = 87;
		 * double 총점 = 국어 + 수학 + 컴퓨터; 
		 * double 평균 = 국어 + 수학 + 컴퓨터;
		 * 
		 * System.out.printf("총점 : %.2f\n", 총점);
		 * System.out.printf(String.format("평균 : %.2f", (double) 평균/3), args);
		 */
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * System.out.print("국어점수 입력 : "); 
		 * int kor = scan.nextInt();
		 * System.out.print("수학점수 입력 : "); 
		 * int math = scan.nextInt();
		 * System.out.print("컴퓨터점수 입력 : "); 
		 * int com = scan.nextInt();
		 * 
		 * int sum = kor + math + com; double avg = sum / 3.0;
		 * 
		 * System.out.println("총점 : " + sum); 
		 * System.out.printf(" 평균 : %.2f", avg);
		 */
		
	
		System.out.print("점수 입력(국어, 수학, 컴퓨터 점수를 띄어쓰기로 넣기) : ");
		int kor = scan.nextInt();
		int math = scan.nextInt(); 
		int com = scan.nextInt();
		
		int sum = kor + math + com;
		double avg = sum / 3.0;
		

		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f", avg);
		
		
		// 자동 타입 변환 
		// byte < short, char (2) < int(4) < long(8) < float(4) < double(8)
		
		// 강제 타입 변환 : Casting
//			큰 타입을 작은 타입 단위로 타입 변환
//			끝의 한 부분만 작은 타입으로 강제적 변환
			
			
	}

}
