package _05_singleton;

public class T01_singleton_main {

	public static void main(String[] args) {
		// 객체를 만들지 못함. > 생성자가 private이어서
		// T01_singleton s1 = new T01_singleton();

		T01_singleton s1 = T01_singleton.getSingleton();		
		T01_singleton s2 = T01_singleton.getSingleton();		
		T01_singleton s3 = T01_singleton.getSingleton();
		
		if(s1 == s2 && s1 == s3 && s2 == s3)
			System.out.println("같은 객체를 가리킨다");
		else
			System.out.println("다른객체");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}