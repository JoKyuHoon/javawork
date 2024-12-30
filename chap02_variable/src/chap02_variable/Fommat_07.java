package chap02_variable;

public class Fommat_07 {

	public static void main(String[] args) {
		String url = "www.google.com";
		// java에서 실수형은 double이 기본자료형
		// 실수형 숫자를 그냥 쓰면 double형으로 인식하기 때문에 오류
		float f1 = 0.10f; // f를 써야함
//      4byte      double(8byte)
		double d1 = 134234.23456789345;
		System.out.printf("%d, %d, %d\n",10, 5, 1);
//	                  각각  10,  5,  1 (,까지 출력한다)
		System.out.printf("%f\n", 1.23456789); // 6자리까지이고 끝에 8이 나온 이유는 반올림했기때문에
		System.out.printf("%f\n", f1);
		System.out.printf("%8f\n", d1);
		System.out.printf("%4.2f\n", d1);  // 총 4자리 중에 소수점 2째 자리 까지
		System.out.printf("%.2f\n", d1);   // ★★★★★★★자주 쓰기 때문에 꼭 외우자!★★★★★★★
		System.out.println("----------------------------------------------");
		
		System.out.printf("%s", url);
		System.out.println("으악");
		
		System.out.printf("%20s\n", url);  // 20자리 자리를 차지하기 때문에 오른쪽으로 정렬 된다.
		
		System.out.printf("%-20s", url); // -를 사용하면 왼쪽으로 정렬
		System.out.println("배고파");
		
		System.out.printf("%.8s\n", url);   // . 을 붙이면 몇글짜까지 출력할지 정할 수있음 (.8s는 8글자만 출력)
		System.out.println("----------------------------------------------");
		
		int octNum = 010;  //(8진수)  10진수 : 8
		int hexNum = 0x10; //(16진수) 10진수 : 16 
		int binNum = 0b10; //(2진수)  10진수 : 2
		
		System.out.printf("octNnm(8진수)은%o, (10진수)=%d\n", octNum, octNum);
		System.out.printf("hexNum(16진수)은%x, (10진수)=%d\n", hexNum, hexNum);
		System.out.printf("%X\n", 10); // >> 10진수의 10을 16진수로 출력
		System.out.printf("%x\n", 10); // >> X, x 대문자 소문자
		
		System.out.printf("binNum(2진수)은%s, (10진수)=%d\n", Integer.toBinaryString(binNum), binNum);
//															    	"10" << 문자열로 출력
		
		int num = 77;
		String a2 = Integer.toBinaryString(num); // 10진수를 2진수로 변경
		String a8 = Integer.toOctalString(num);  // 10진수를 8진수로 변경
		String a16 = Integer.toHexString(num);   // 10진수를 16진수로 변경
		
		System.out.println("10진수 77을 2진수로 변환 : " + a2);
		System.out.println("10진수 77을 8진수로 변환 : " + a8);
		System.out.println("10진수 77을 16진수로 변환 : " + a16);
		
		
		
		
		

	}

}
