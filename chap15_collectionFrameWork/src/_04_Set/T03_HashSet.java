package _04_Set;

import java.util.HashSet;
import java.util.Set;

// equals()를 오버라이딩 했을 때 hashCode()를 반드시 오버라이딩 해야 됨
class Member {
	String name;
	int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) { // < Override했기 때문에 Object를 넣어줘야함
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return m.name.equals(name) && m.age==age;			
		}
		return false;
	
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
}

public class T03_HashSet {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		set.add(new Member("조규호", 27));
		set.add(new Member("조규훈", 30));
		set.add(new Member("방성환", 27));
		set.add(new Member("김동현", 28));
		set.add(new Member("임기준", 30));
		set.add(new Member("허재윤", 28));
		
		System.out.println("총 객체 수 : " + set.size());
		System.out.println(set);
	}

}
