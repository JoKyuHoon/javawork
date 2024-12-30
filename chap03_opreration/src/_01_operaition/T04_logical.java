package _01_operaition;

public class T04_logical {

	public static void main(String[] args) {
		// 논리곱(and=&&)과 논리합(or=||)
		/*
		 x  y 논리곱(&&)   논리합(||)
		 0  0    0         0
		 0  1    0         1
		 1  0    0         1
		 1  1    1         1
	     */   
		
		int num1 = 10;
		int num2 = 20;
		
		boolean result = num1==num2 && num2>num1;
//							f(0)    &&    t(1)
		System.out.println(result);
		
		result = num1==num2 || num2>num1;
		System.out.println(result);
		System.out.println("--------------------------");
		
		// ! : not
		boolean b1 = num1 >= num2;
		System.out.println(b1);
		System.out.println(!b1);
		System.out.println(!!b1);
		
		// A : 65~90, a : 97
		char ch1 = 'K';
		System.out.println(ch1);
		System.out.println("대문자인가? " + (ch1 >='A' && ch1 <='Z'));
		System.out.println("소문자인가? " + (ch1 >='a' && ch1 <='z'));
		
//		ch1 >= 'A'(65) && ch1 <= 90
//		65, 66, 67 ... 90, 91, ...	(65이상이면 참)
//		
//		ch1 <= 'Z' (90)
//		..., 63, 64, 65 ..., 89, 90 (90이하면 참)
//		
//		겹치는 구간(65~90)이 참		
		
		
		
		
		
	}

}
