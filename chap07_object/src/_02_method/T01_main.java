package _02_method;

public class T01_main {

	public static void main(String[] args) {
		T01_api_method m1 = new T01_api_method();
		m1.print1();
//               () 가 붙으면 메소드임
//               () 가 없으면 변수		
	
		m1.print2();
	    System.out.println(m1.print2());
		int result = m1.print2();
		System.out.println(result);
		
		System.out.println(m1.print3());
		
		System.out.println(m1.print4());
		
		m1.print5(10);
		// void x 괄호에 10을 적었기 때문에 x라는 변수에 10이 들어감
		
		int sum = m1.print6(3, 10);
		System.out.println(sum);
		
		System.out.println(m1.print6(10, 100));
		
		m1.print7("악", 5);
		
		
		T01_api_op o1 = new T01_api_op();
		
		
		System.out.println(o1.add(84524641, 489812374));
		// int re = o1.add(4,10);
		// System.out.println(re);
		
		System.out.println(o1.sub(84, 5));
		
		
		System.out.println(o1.mul(100, 5));
		
		System.out.println(o1.rem(100, 45));
		
		System.out.printf("%.1f",o1.div(100, 50));
		
		
		
		
		
	}

	
}