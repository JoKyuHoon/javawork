package _02_userException;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		
		
		// 정수 두개를 더한값 출력하고 양수만
		  try {
	            System.out.println("첫 번째 정수를 입력하세요 : ");
	            int num1 = sc.nextInt();
	            System.out.println("두 번째 정수를 입력하세요 : ");
	            int num2 = sc.nextInt();

	            // sum 메서드 호출
	            sum(num1, num2);
	        } catch (ex_UserException e) {
	            // 예외 처리
	            System.out.println(e.getMessage());
	 }
}
	            

	
      public static void sum(int num1, int num2) throws ex_UserException {
	  if (num1 < 0 || num2 < 0) {
   	 throw new ex_UserException("양수만 입력하세요.");
      } else {
         System.out.println("두 수를 더한 값 : " + (num1 + num2));     }
		
	
	
     }
}