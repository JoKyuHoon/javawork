package _08_comparable;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
	@Override
	public String toString() {
		return "Person : name=" + name + ", age" + age;
	}
	
}
public class T01_Comparable {

	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<>();
		treeset.add(new Person("조규호", 25));
		treeset.add(new Person("김동현", 3));
		treeset.add(new Person("방성환", 4));
		
		System.out.println(treeset); // 사용시 toString() 오버라이딩.
		
		Iterator<Person> iterator = treeset.iterator();
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.name + ":" + p.age);
		}
		
	}


}
