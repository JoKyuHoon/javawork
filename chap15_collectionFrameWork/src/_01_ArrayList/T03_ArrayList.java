package _01_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class T03_ArrayList {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(6);
		list.add(2);
		
		System.out.println("list : " + list);
		
		List list2 = new ArrayList(list.subList(1, 3));
		System.out.println("list2 : " + list2);
		System.out.println("-----------------------------------");
		
		// Collection.sort()
		Collections.sort(list);  // 반환형 void
		System.out.println("오름차순 정렬 : " + list);
//		Collections.reverse(list);
//		System.out.println("내림차순 정렬 : " + list);
		
		// contains(객체) : 객체를 포함하고 있는가?
		// containsAll(객체들) : 객체들(모두)를 포함하고 있는가?
		System.out.println("list는 list2의 모든 요소를 갖고 있는가? " + list.containsAll(list2)); 
		System.out.println("-----------------------------------");
		
		list2.add("B");
		list2.add("C");
		list2.add(1, "AA");
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println("-----------------------------------");
		
		// retainAll(객체들) : 객체들에 있는것만 빼고 나머지 삭제
}
}