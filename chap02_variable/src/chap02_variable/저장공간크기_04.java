package chap02_variable;

public class 저장공간크기_04 {

	public static void main(String[] args) {
		System.out.println("byte크기 = " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short크기 = " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int크기 = " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long크기 = " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		System.out.println("char크기 = " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
		// Charater는 문자형 이기 때문에 앞에 (int)를 넣어야 숫자가 나온다.
		
		
	}

}
