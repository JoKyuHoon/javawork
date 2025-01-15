package _01_langPackage;
/*
 * 
   clone() : 객체 복제
   implements Cloneable : clone하고자하는 클래스에 반드시 넣어줘야 한다
                         '이 클래스는 복제할 수 있는 클래스이다 라는 것을 알려주기 위해'
   clone()을 오버라이딩하지 않아도 된다. 
   그러나, Object클래스의 clone() 메소드는 접근제어자가 protected라서 같은 java.lang패키지에 있어야한다.      
   2번과 같은 이유로 clone()을 오버라이딩 해야함.                 
 */
class Point implements Cloneable {
	int x;
	int y;
	Point() { }
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	/*
	// return의 자료형이 Object클래스를 사용할 때는 형변환을 계속 해줘야 한다.
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
			}
	*/
	
	// 처음부터 반환형을 자신의 객체 클래스로 해주면 사용시 형변환하지 않아도됨
	@Override
	public Point clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return (Point)obj;
		}
	
	
	@Override
	public String toString() {
		return "x=" + x +",  "+ "y=" + y; 
	}
}
public class T04_clone {

	public static void main(String[] args) {
//		Point p1 = new Point(3, 4);
//		System.out.println(p1);
//		x=3, y-4
		
		Point original = new Point(3, 4);
		Point copy = (Point)original.clone();
		System.out.println("original 객체 : " + original);
		System.out.println("복제 객체 : " + copy);
		System.out.println("------------------------");
		
		copy.x = 100;
		System.out.println("original 객체 : " + original);
		System.out.println("복제 객체 : " + copy);
		 
//		 Object

	}

}
