package _01_access;

public class T01_access {
	int num = 5; // 같은 패키지 안에서 접근 가능
	final double PI = 3.14; // 상수(는 변수명을 대문자 씀) 
	private String name = "조규훈"; // 이 클래스 안에서만 접근가능
	/*
	/ setter, getter 메소드 : 변수 앞에 private에 접근 할 수 있도록 메소드 정의

      setter 메소드 : 변수에 값을 넣을 때
      반환형 set변수명(자료형 변수명) {
      this.변수명 = 변수명
      }
  	  getter 메소드 : private가 붙은 변수의 값을 리턴
      반환형 get변수명() {
      return 변수명;
	  }
	 
	 */
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	/*
	 * final 변수  -> 상수가 됨
	 * final 메소드 -> 오버라이딩 불가
	 * final 클래스 -> 상속 불가
	 */
	
}
