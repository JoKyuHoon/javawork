package _04_staticEx;

public class Product {
	
	String sn;
//	String name = "더조은";
	static int count;

	Product() {
		sn = "더조은" + ++ count;
	}
	
	
//	Product(int num) {
//		System.out.println("고유한 제품번호: " + num + " " + name + ++count);
//	}
	
	
	
//	Product(String str){
//		
//		System.out.println("생상된 총 제품의 갯수 : " + count);
	}


