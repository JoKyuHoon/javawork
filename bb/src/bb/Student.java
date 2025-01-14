package bb;


class Person {
	int age;
	Person(int age) {
		this.age = age;
	}
}
class Student extends Person {
	Student(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}
	String school;
	Student(int age, Stirng school){
		this.age = age;
		this.school = school;
		
	}
	

}
