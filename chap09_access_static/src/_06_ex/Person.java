package _06_ex;

public class Person {

	String name;
	String gender;
	int age;
	int heigt;
	int weigt;
	
	public Person(String string, String string2, int i, int j, int k) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.heigt = heigt;
		this.weigt = weigt;
		
	}
	void name() {
		System.out.println("이름");
	}
	
	void gender() {
		System.out.println("성별");
	}
	void age() {
		System.out.println("나이");
	}
	void heigt() {
		System.out.println("키");
	}
	void weigt() {
		System.out.println("몸무게");
	}
	
	
	

	public static void main(String[] args) {
	
	Person p1 = new Person("조규훈", "남자", 10, 2, 3);
	
	
	p1.name();
	p1.gender();
	p1.age();
	p1.heigt();
	p1.weigt();
	
		
	}

	
}
