package _05_Wrapper;
/* 
   Boxing과 UnBoxing
   
   Boxing : 기본자료형을 참조자료형으로 변환
   UnBoxing : 참조자료형을 기본자료형으로 변환
 */
public class T01_Wrapper {
	public static void main(String[] args) {
		// 권장사항
		Integer i1 = new Integer(3); // deprecated : 앞으로 없어질 예정이니 되도록 쓰지 말라는 뜻
		Integer i2 = Integer.valueOf(3);
		
		Character ch = 'z';
		System.out.println(ch);
		
		//autoUnBoxing
		int num = Integer.parseInt("100");
		System.out.println(num);
			
		int num2 = Integer.valueOf("100");
		System.out.println(num2);
		
		
		// Boxing
		int num3 = 10;
		Integer num4 = Integer.valueOf(num3);
		
		String str = "10";
		Integer num5 = Integer.valueOf(str);
		System.out.println(num5);
		
		double dou = 12.345;
		double dou2 = Double.valueOf(dou);
		System.out.println(dou2);
		
		
	}
}