package _01_abstract;

/*
 * 추상메소드가 1개라도 포함되어 있으면 반드시 추상클래스로 해야됨
 * 추상메소드 : 메소드에 선언부만 있고 내용(프로그램)은 없는 메소드
 * 			ex void 메소드명(매개변소); (추상메소드는 앞에 abstract를 붙임) 
 * 				>> abstract메소드명(매개변수);
 *  추상클래스는 객체를 생성할 수 없다(그래서 상속으로 받아서 사용됨)
 */
// 추상클래스(추상 메소드가 하나라도 포함되어있으면 class에도 abstract를 추가해줘야함)
abstract public class Pet {

	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	// 추상 메소드가 하나라도 포함되어있으면 class에도 abstract를 추가해줘야함
	abstract void sound();
	
	void info() {
		System.out.println("종류 : " + kind + ", 색상 : " + color);
	}
	

	String getKind() {
		return kind;
	}

	String getColor() {
		return color;
	}

	String getFeature() {
		return feature;
	}
	
	
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
	}
	
	
	
}
