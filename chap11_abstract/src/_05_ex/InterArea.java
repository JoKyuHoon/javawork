package _05_ex;

 public class InterArea implements Rectangle, Triangle {
	 
 
	// 멤버변수 선언
			double height;						
			double width;					

			// 기본 생성자
			public void Rectangle() {	}		
			
			// 인자 생성자
			public void Rectangle(double heigth, double width) {
				this.height=heigth;
				this.width=width;
			}								

			// 프로토타입 메서드 구현
			@Override
			public double rectangle() {
				return height * width;

	
	
	
}
 }
