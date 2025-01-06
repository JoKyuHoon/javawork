package _03_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		
//		1. 길이 10인 배열을 선언하고 1~10까지 반복문을 
//		   이용하여 순서대로 넣고 출력하기
		
		int[] num1 = new int[10];
		
		for(int i=0; i<num1.length; i++) {
			num1[i] = i + 1;
			System.out.println(num1[i]);
		}
		
		
		
//
//		2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
//		   이용하여 역순으로 배열 인덱스에 넣고 값 출력
		
//		   num2[0] = 10;
//         num2[0] = 10;
//         num2[0] = 10;
//         
//         int num2[] = new int[10];
//         for(int i = 0; i<num2.length; i++ {
//             num2[i] = 10-1;
//             System.out.println(num2[1] + ", ");
//             }
//             System.out.println();
//             System.out.println();
		
		
//
//		3. 사용자로 부터 입력받은 수 만큼 배열을 만들고
//		   1~입력받은 수를 차례대로 넣어 출력
		
//		Scanner sc = new Scanner(System.in);
//	    System.out.print("배열의 갯수 입력 : ");
//	    int arrCount = sc.nextInt();
//	    
//	    int[] num3 = new int[arrCount];
//	    for(int i=0; i<num3.length; i++) {
//	    	num3[i] = i + 1;
//	    }
		
		

//		4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후
//		   배열 인덱스를 이용하여 귤 출력
		
		
//	    String str[] = {"사과","귤","포도","복숭아","참외"};
//	    System.out.println(str[1]);
//		System.out.println();
		
		
	    
//
//		5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
//		   ex)
//		   문자열 : application
//		   문자 : i
//		   application에 i가 존재하는 위치(인덱스) : 4 8 
//		   i 개수 : 2
		
		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next();
//		
//		System.out.print("찾을 문자 입력 : ");
//		char search = sc.next().charAt(0);
//		
//		char[] chRe = new char[str1.length()];
////                                     메소드 이용
//		int count = 0;
//		String index = "";
//		
//		for(int i=0; i<chRe.length; i++) {   // 3  5
//			chRe[i] = str1.charAt(i);
////			chRe[0] = str1.charAt(0);
////			chRe[1] = str1.charAt(1);
//			if(chRe[i] == search) {
//				count++;
//				index += i + " "; // << + (" " 는 한 칸 띄고)			
//				
//			}
//						
//		}
//	
		
		
//	    System.out.println(str1 + "에" + search + "가 존재하는 위치(index)" + index);
//	    System.out.println(search + "의 개수 : " + count);
//	    System.out.println();
	      
	    
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next();
//		
//		System.out.print("찾을 문자 입력 : ");
//		char search = sc.next().charAt(0);
//		
//	    int count = 0;
//		int[] index = new int[str1.length()];
//		int z = 0;
//		
//		for(int i=0; i<chRe.length; i++) {
//			chRe[i] = str1.charAt(i);
//	
//			if(chRe[i] == search) {
//				count++;
//				index[z++] = i;
//			}
//			
//		}
//		
//		    for(int i=0; i<count; i++) {
//		    	System.out.print(index[1]);
//		    	
//		    }
//		    System.out.println(str1 + "에" + search + "가 존재하는 위치(index)" + index);
//		    System.out.println(search + "의 개수 : " + count);
//		    System.out.println();
	    
	    
//
//		6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
//		   숫자와 같은 요일 출력
//		   ex.
//		   0 ~ 6 사이 숫자 입력 : 4			
//		   금요일
//		   0 ~ 6 사이 숫자 입력 : 7
//		   잘못 입력하셨습니다.
		
//		char[] days = {'월','화','수','목','금','토','일'};
//		System.out.print("0~6사이 숫자 입력 : ");
//		int num6 = sc.nextInt();
		
//		// days[num6] + "요일"
		
//		if(num6 >=0 && num6 <= 6) {
//			System.out.println(days[num6] + "요일");
//		}else {
//			System.out.println("잘못입력하셨습니다.");
//		}
//		
//		System.out.println();
		// days[num6] + "요일"
				
		

//		7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
//		   배열 전체의 합 출력
		
//		System.out.print("배열의 크기 입력 : ");
//		int num7 = sc.nextInt();
//		
//		int[] arr7 = new int[num7];
//		
//		int sum = 0;
//		for(int i=0; i<arr7.length; i++); {
//			System.out.print(i+1 + "번째 값 입력 : ");
//			arr7[i] = sc.nextInt();
//			sum += arr7[i];
//		}
//		
//		System.out.println("합계 : " + sum);
		
	
		

//		8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		   다시 정수를 받도록 하세요. 								
//		   ex.
//		   정수 : 4
//		   다시 입력하세요.
//		   정수 : -6
//		   다시 입력하세요.
//		   정수 : 5
//		   1, 2, 3, 2, 1
		
//		while(true) {
//		System.out.print("3이상인 홀수의 정수 입력 : ");
//		int num8 = sc.nextInt();
//		
//		if(num8 >= 3 && num8%2 == 1) {
//			
////		5/2 = 2	  5 => 1, 2, 3, 2, 1                : index 2까지 증가 그 이후 감소
////		7/2 = 3	  7 => 1, 2, 3, 4, 3, 2, 1          : index 3까지 증가 그 이후 감소
////		9/2 = 4	  9 => 1, 2, 3, 4, 5, 4, 3, 2, 1    : index 4까지 증가 그 이후 감소
//		  int value = 1;	
//		  int[] arr8 = new int[num8];	
//		  for(int i=0; i<arr8.length; i++) {
//			  if(i <num8/2) {
//				  arr8[i] = value++;
//			  }else {
//				  arr8[i] = value--;
//			  }
//		  }
//		  break;		
//		}else{
//			System.out.println("다시 입력하세요.");	
//		}
//		    System.out.print(arr8[i] + " ");
//	}
	
		
		
		
		
		
//
//		9. 사용자가 입력한 값이 배열에 있는지 검색하여
//		   있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		   단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
//		   ex.
//		   치킨 이름을 입력하세요 : 양념			
//		   양념치킨 배달 가능
//
//		   치킨 이름을 입력하세요 : 불닭
//		   불닭치킨은 없는 메뉴입니다.
		
//		   String[] chickens = {"후라이드", "양념", "파닭", "허니버터"};
//		   System.out.println("치킨이름 입력 : ");
//		   String menu = sc.next();
//		   
//		   boolean flag = false;
//		   for(int i=0; i<chickens.length; i++) {
//			   if(menu.equals(chickens[i])) {
//				   flag = true;
//				   break;
//				   
//			   }
//		   }
//		
//		   if(flag)
//			   System.out.println(menu + "치킨은 배달 가능");
//		   else
//			   System.out.println(menu + "치킨은 없는 메뉴입니다.");
		

//		10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		     1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		     배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//
//		     ex.
//		     5 3 2 7 4 8 6 10 9 10 
//		     최대값 : 10
//		     최소값 : 2
		   
		   

//		11. 사용자로부터 정수값 5개 배열에 입력
//		    오름차순 정렬로 정렬하기 (버블정렬)
		
//		int bubble[] = {68, 15, 35, 57, 23, 4};
//		               
//		                      
//		for(int i=0; i<bubble.length-1; i++) {   // 라운드 돌기
//			boolean flag = false;
//			for(int j=0; j<bubble.length-i-1; j++) {   // 배열 안에 돌기
//				if(bubble[j] > bubble[j+1]) {
//					int tmp = bubble[j];
//					bubble[j] = bubble[j+1];
//					bubble[j+1] = tmp;
//					flag = true;
//				}
//			}
//			if(!flag) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(bubble));
		   
		   

//		12. 각 학생별 국어 영어 수학점수의 총점과 평균을 구하고
//		   각 과목별 총점과 평균을 구해 아래와 같이 출력하기
//		   점수는 2차원 배열로 마음대로 넣는다.
//
//		  번호    국어    영어    수학    총점   평균
//		-----------------------------------------
//		   1     95    100     78   273  83.3
//		   2     68     57    100   273  83.3
//		   3     62     97     85    273  83.3
//		   4     85     83     69    273  83.3
//		   5     86     74     38    273  83.3
//		-----------------------------------------
//		총점   479   500   387 
//		평균  95.0  100.0  78.3
		
//		int score[][] = {{ 95, 100, 78},
//			           	{68, 57, 100},
//			         	{62, 97, 85},
//			        	{85, 83, 69},
//			        	{86, 74, 38}};
//		
//		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
//		System.out.println("--------------------------------------------");
//		
//		
//		for(int i=0; i<score.length; i++) {
//			int sum = 0;
//			System.out.print(i+1 + "\t");
//			for(int j=0; j<score[i].length; j++) {
//				sum += score[i][j];
//				System.out.print(score[i][j] + "\t");
//				
//			}
//			
//			System.out.printf("%d\t%.1f\n", sum, (double)sum/score[i].length);
//					
//		}	
//		
//		System.out.println("--------------------------------------------");
//		
		   
		
		
		
		

	}

}
