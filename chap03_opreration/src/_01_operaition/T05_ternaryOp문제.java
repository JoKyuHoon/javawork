package _01_operaition;

import java.util.Scanner;

public class T05_ternaryOp문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
//		1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
       /*		
		System.out.print("정수를 입력하시오 : ");
		int a = scan.nextInt();
		
  	    String re1 = a > 0 ? "양수" : "양수x";
  	    
  	    
   	    System.out.println(a > 0 ? "양수" : "양수x");
// 	    ↕ 둘이 같음
   	    System.out.println(re1);
   	    */
//		
//		
   	    
//		
//		
//		
//		2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
   	    
//   	    System.out.print("정수를 입력하시오 : ");
//		int a1 = scan.nextInt();
//	    String re2 = a1 > 0 ? "양수" : a1 < 0 ? "음수" : "0";
////	                                  a1 == 0 ? "0" : "음수"; 
//	    System.out.println(re2);
	    	
   	    
//		3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
		
//		System.out.print("정수를 입력하시오 : ");
//		int a3 = scan.nextInt();
//	    
//	    String re3 = a3 % 2 == 0 ? "짝수" : "홀수";
//	    
//        System.out.println(re3);	   
//		if(a3 % 2 == 0) {
//			System.out.println("입력하신 정수는 짝수입니다.");  }
//	    else {
//	        System.out.println("입력하신 정수는 홀수입니다.");  }
		
		
	    
	    
//		4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다
//		   사용자로부터 인원수와 사탕의 갯수를 입력받아
//		   1인당 동일하게 나눠가진 사탕 개수와
//		   나눠주고 남은 사탕 갯수를 출력하기
	        
//	      System.out.print("인원수를 입력하세요 : ");
//	      int p = scan.nextInt();
//	      System.out.print("사탕의 갯수를 입력하세요 : ");
//	      int c = scan.nextInt();
////	      
////	       
////	      
////	      
//	      int re4 = c / p;
//	      int re4_1 = c % p;
//	      System.out.println("1인당 동일하게 나눠가진 사탕 개수 : " + re4);
//	      System.out.println("나머지 사탕 개수 : " + re4_1);
				
	        
	        
				
//		5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
//				이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.
	      
//			ex.
//			이름 : 이준기
//			학년(숫자만) : 2
//			반(숫자만) : 7
//			번호(숫자만) : 3
//			성별(M/F) : M
//			성적(소수점 둘째 짜리까지) : 97.35
//			
//			2학년 7반 3번 이준기 남학생의 성적은 97.35이다.
		
//	      System.out.print("이름 : ");
//	      String name = scan.next();
//          System.out.println(name);
//		        
//	      System.out.print("학년(숫자만) : ");
//	      int grade = scan.nextInt();
//	      System.out.println(grade);
//	      
//	      System.out.print("반(숫자만) : ");
//	      int gradeClass = scan.nextInt();
//	      System.out.println(gradeClass);
//		        
//	      System.out.print("번호 : ");
//	      int num = scan.nextInt();
//	      System.out.println(num);
//		        
//		  System.out.print("성별 : ");
//	      char gender = scan.next().charAt(0);
//          System.out.println(gender);
//		                
//	      System.out.print("성적 : ");
//	      double score = scan.nextDouble();
//		  System.out.printf("%.2f\n", score);
//		  
//		  String genderRe = gender == 'M' ? "남":"여";
//		        
//          System.out.println
//(grade + "학년 " + grade + "반 " + num + "번 " + name +" "+ genderRe + "학생의 " + "성적은 " + score + " 이다.");
//		      
//          System.out.printf("%학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.",
//        		          grade, num, gradeClass, name, genderRe, score);
		        
		        
//
//		6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
//		    14세~19세 이하이면 청소년
//		    20세 이상이면 성인으로 출력하시오
		
//	    조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행   		    
//		System.out.print("나이를 입력하세요 : ");
//		int age = scan.nextInt();
//		String re1 = age <= 13 ? "어린이" : age <=19 ? "청소년" : "성인";     
//		System.out.println(re1);
//
//		    
//		String re1_1 = age <= 13 ? "어린이" : age >= 13 && age <= 19 ? "청소년" : "성인";
//		System.out.println(re1_1);
		
		    
		    
		        

//		7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
//		   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//		System.out.print("국어, 영어, 수학의 점수 입력 : ");
//		int kor = scan.nextInt();
//		int eng = scan.nextInt();
//		int math = scan.nextInt();
//		
//		double avg = (kor + eng + math) / 3.0;
//		
//		
//		String re11 = kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격";
//		System.out.println(re11);
		
//
//		8. 주민번호를 입력받아 남자인지 여자인지 출력하기
//				
//				ex.
//				주민번호를 입력하세요(- 포함) : 123456-3123456
		  
//		System.out.print("주민번호 입력(-포함) : ");
//		String ReNum = scan.next();
//		char gen = ReNum.charAt(7);
			
		
		
//		char ReNum = scan.next().charAt(7);
//        String gen = ReNum == '1' || ReNum == '3' ? "남자" : "여자";
//        System.out.println("성별 : " + gen);
        
		

//		9.  사용자로부터 두 개를 입력 받고(num8, num9에 저장)
//		    또 다른 정수를 입력 받아 그 수가 num8 이하거나 num9 초과이면 true를 출력하고
//		    아니면 false를 출력하세요. (단, num8은 num9보다 작아야 함)
        
        
        
//        System.out.println("2개의 정수 입력(첫번째 정수는 두번째 정수보다 작은숫자여야함) : ");
//        
//        int num8 = scan.nextInt();
//        int num9 = scan.nextInt();
//        
//        System.out.println("정수 입력 : ");
//        
//        int num10 = scan.nextInt();
//        
//        boolean re111 = num10 <= num8 || num10 > num9; 
//        
//        System.out.println(re111);
        
//        10. 사용자로부터 3개의 수를 키보드로 입력 받아 
//        입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요 
        System.out.print("3개의 정수 입력 : ");
        int num11 = scan.nextInt();
        int num12 = scan.nextInt();
        int num13 = scan.nextInt();
        
        boolean re22 = num11 == num12 && num11 == num13;
        
        System.out.println("3개의 숫자가 모두 같은가? " + re22);
		    
	    
	}
	
}
