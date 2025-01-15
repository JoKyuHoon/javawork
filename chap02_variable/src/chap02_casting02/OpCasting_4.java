package chap02_casting02;


public class OpCasting_4 {

	public static void main(String[] args) {
		//int보다 작은 자료형은 연산시 무조건 int형
		byte b1 = 10;
		short s1 = 5;
		
		int result = b1 + s1;
		byte result2 = (byte)(b1 + s1);
		System.out.println(result2);
		
		
	    	double iNum1 = 10;
		
		 System.out.printf("%.1f\n", iNum1);
		
	}

}
