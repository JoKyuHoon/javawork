package _03_ex;

public class Member {
	String name;
	int age;
	String gender;
	
	public Member() {
		
	}
	public Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String setName() {
		return name;
	}
	public void getName(String name) {
		this.name = name;
	}
	public int setAge() {
		return age;
	}
	public void getAge(int age) {
		this.age = age;
	}
	public String setGender() {
		return gender;
	}
	public void getGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "나이 : " + age + "성별 : " + gender;
	}
	
}
