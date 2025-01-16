
package _01_access;

public class T01_access_main {

	public static void main(String[] args) {
		T01_access ac = new T01_access();
		ac.num = 10;
		System.out.println(ac.PI);
		// ac.PI = 456; >> 상수라서 값 변경 안됨
		
		// ac.name = "조규호";
		// System.out.println(ac.name);
		ac.setName("방생");
		String name = ac.getName();
		System.out.println(name);
	}

}
