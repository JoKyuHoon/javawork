package _04_staticEx;

public class Product {
	
	
	String name = "더조은";
	static int count;

	
	
	
	Product(int num) {
		System.out.println("고유한 제품번호: " + num + " " + name + ++count);
	}
	
	
	
	Product(String total) {
		
		System.out.println("생상된 총 제품의 갯수: " + count);
	}

}
