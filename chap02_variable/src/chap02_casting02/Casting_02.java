package chap02_casting02;

public class Casting_02 {

	public static void main(String[] args) {
		
		int num1 = 1234567;
		byte b1 = (byte)num1;
		System.out.println(b1);
		
		// Java에서 정수의 기본자료형 int(4byte)
		float f1 = (float)5.345; // 혹은 5.345f
//		flaot = double
//		  long     =     int
		
		// Java에서 정수의 기본자료형 double
		long long1 = 1111111111111134567L;
		float flo2 = long1;
		
//		long = int
        
		
		int num2 = 51312;
		char ch1 = (char)num2;
		System.out.println(ch1);
		
//		int 이하의 타입(byte, char, short, int) 연산은 int형으로 자동형변환  
//      ex)  char ch = 'a' 
//		     char b = ch + 1; << 오류.  -> int b = ch + 1 로 해야 오류X
		
//		long타입(8byte) 연산 = long
		
//		실수 타입 연산
//		double 연산 = 모두 double
//		float 연산 : 모두 float일 경우
		
		
		                                                           

		
		
	}

}
