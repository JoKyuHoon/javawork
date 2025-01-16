package _04_staticEx;

public class Product_main {

	public static void main(String[] args) {
		
		
		
		
//		Product p1 = new Product(9845);
//		Product p2 = new Product(4861);
//		Product p3 = new Product(1298);
	
		Product p4 = new Product();
		Product p5 = new Product();
		
		System.out.println("p1 제품번호 : " + p4.sn);
		System.out.println("p1 제품번호 : " + p5.sn);
		System.out.println("생상된 총 제품의 갯수 : " + Product.count);
		
	}

}
