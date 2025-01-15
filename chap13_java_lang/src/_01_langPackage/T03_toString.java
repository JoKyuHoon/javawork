package _01_langPackage;
class Dog {
	String kind;
	int age;
	Dog() {
		this("말티즈", 3);
	}
	Dog(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}
	@Override
	public String toString() {
		return kind + ", " + age;
	}
}
public class T03_toString {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("도베르만", 1);
		
		// 객체를 넣은 변수를 출력하면 toString() 메서드가 호출됨
		// Object클래스의 toString() : 패키지명.클래스명@해시코드(16진수로)
		System.out.println(dog1);
		System.out.println(dog1.toString());
		
		System.out.println("----------");
		
		System.out.println(dog2);
		System.out.println(dog2.toString());
		
		// 객체를 넣는 변수의 값이 null이면 null을 출력해줌(toString()을 호출하지 않음)
		Dog dog3 = new Dog();
		System.out.println(dog3);
	}

}
