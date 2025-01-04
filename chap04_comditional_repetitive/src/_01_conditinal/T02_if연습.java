package _01_conditinal;

import java.util.Scanner;

public class T02_if연습 {

	public static void main(String[] args) {
//	      7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
//		     세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.(if문 사용)
		
		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("국어, 영어, 수학 점수 입력 : ");
//		
//		
//		int kor = scan.nextInt();
//		int eng = scan.nextInt();
//		int math = scan.nextInt();
//		
//		double avg = (kor + eng + math) / 3;
//		
//		
//		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60)
//			System.out.println("합격");
//		else
//			System.out.println("불합격");
//		
		
		
		

/*
  2. 
  id와 비밀번호를 변수에 저장하고
  사용자로부터 아이디와 비밀번호를 입력 받아
  아이디와 비밀번호가 모두 맞으면 "로그인 성공"출력
  아이디가 틀렸으면 "아이디가 틀렸습니다"출력
  비밀번호가 틀렸으면 "비밀번호가 틀렸습니다"출력
*/
		
		
//	 int id = 123;
//	 int password = 456;
//	 
//	 System.out.println("아이디를 입력하세요 : ");
//	 int num1 = scan.nextInt();
//	 System.out.println("비밀번호를 입력하세요 : "); 
//	 int num2 = scan.nextInt();
//	 
//	 if (num1 == id && num2 == password) 
//		 System.out.println("로그인 성공");
//	 else if (num1 != id && num2 == password)
//	     System.out.println("아이디가 틀렸습니다");
//	 else if (num1 == id && num2 != password)
//         System.out.println("비밀번호가 틀렸습니다");
//	 else
//		 System.out.println("아이디와 비밀번호 모두 틀렸습니다");

	
	 
			 
		

//3. 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 
//   계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.
//
//	- BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만
		
//	 System.out.println("몸무게를 입력하세요(kg) : ");
//	 double weight = scan.nextDouble();
//	 
//	 System.out.println("키를 입력하세요(m) : ");
//	 double height = scan.nextDouble();
//		
//	 double heightM = height / 100;
//	 
//	 double BMI = weight / (heightM * heightM);
//	 System.out.printf("%.1f\n", BMI);
//	 
//	 if (BMI < 18.5)
//         System.out.println("저체중");
//	 else if(BMI >= 18.5 && BMI <= 22.9)
//	     System.out.println("정상");
//	 else if (BMI >= 23 && BMI <= 24.9)
//         System.out.println("과체중");
//	 else if (BMI >= 25 && BMI <= 29.9)
//	     System.out.println("비만");
//	 else 
//         System.out.println("고도 비만");
    
			 
			 
			 


//4. 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력
//   평가 비율은 중간고사 20%, 
//                  기말고사 30%, 
//                  과제 30%, 
//                  출석 20%로 이루어져 있고 
//   이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산.
//   70점 이상일 경우 Pass,
//   70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력
	 
//	 System.out.println("중간고사 점수 : ");
//	 int score1 = scan.nextInt();
//	 
//	 System.out.println("기말고사 점수 : ");
//	 int score2 = scan.nextInt();
//	 
//	 System.out.println("과제 점수 : ");
//	 int score3 = scan.nextInt();
//	 
//	 System.out.println("출석 회수 : ");
//	 int score4 = scan.nextInt();
		
	
	 
//	 System.out.println("중간고사 점수(20) : " + score1 * 0.2);
//	 System.out.println("기말고사 점수(30) : " + score2 * 0.3);
//	 System.out.println("과제 점수(30) : " + score3 * 0.3);
//	 System.out.println("출석 회수(20) : " + score4);
//	 
//	
//	 double total = (score1 * 0.2) + (score2 * 0.3) + (score3 * 0.3) + score4;
//	 System.out.println(total);
//	 
//	 if (total > 70)
//		 System.out.println("Pass");
//	 else if (total < 70 && score4 >= 6)
//	     System.out.println("Fail");
	 
	 
	 
	 
//	ex) 1.
//	중간고사 점수 : 80
//	기말고사 점수 : 30
//	과제 점수 : 70
//	출석 회수 : 18
//	============= 결과 ============
//	중간 고사 점수(20) : 16.0
//	기말 고사 점수(30) : 9.0
//	과제 점수(30) : 18.0
//	출석 점수(20) : 18.0
//	총점 : 61.0
//	Fail [점수 미달]
//
//	ex) 2.
//	중간고사 점수 : 80
//	기말고사 점수 : 90
//	과제 점수 : 50
//	출석 회수 : 15
//	============= 결과 ============
//	중간 고사 점수(20) : 16.0
//	기말 고사 점수(30) : 27.0
//	과제 점수(30) : 15.0
//	출석 점수(20) : 15.0
//	총점 : 73.0
//	Pass
//
//	ex) 3.
//	중간고사 점수 : 100
//	기말고사 점수 : 80
//	과제 점수 : 40
//	출석 회수 : 10
//	============= 결과 ============
//	Fail [출석 횟수 부족(10/20)]
   
			
		System.out.print("중간고사, 기말고사 점수 입력 : ");
		int middleScore = scan.nextInt();
		int finalScore = scan.nextInt();
		
		System.out.print("과제 점수 입력 : ");
		int report = scan.nextInt();
		
		System.out.print("출석 횟수 입력(총20회) : ");
		int attendScore = scan.nextInt();
		
		double mScore = middleScore * 0.2;
		double fScore = finalScore * 0.3;
		double rScore = report * 0.3;
		double result = mScore + fScore + rScore + attendScore;
		System.out.println("-----------------------------");
		
		System.out.println("중간고사 점수" + middleScore);
		System.out.println("기말고사 점수" + finalScore);
		System.out.println("과제 점수" + report);
		System.out.println("출석 점수" + attendScore);
		System.out.println("============ 결 과 ===========");
		
		if(attendScore < 20*0.7) {
			System.out.printf("Fail [출석 횟수 부족(%d/20)]\n", attendScore);
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", mScore);
			System.out.printf("기말 고사 점수(30) : %.1f\n", fScore);
			System.out.printf("과제 점수(30) : %.1f\n", rScore);
			System.out.printf("출석 점수(20) : %d\n", attendScore);
			System.out.printf("총점 : %.1f\n", result);
			if(result >= 70)
				System.out.println("PASS");
			else
				System.out.println("FAIL [점수 미달]");
			  
		 }
		
		
		
		

	}

}
