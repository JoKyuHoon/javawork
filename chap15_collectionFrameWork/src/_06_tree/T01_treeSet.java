package _06_tree;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T01_treeSet {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("금액을 입력하세요 : ");
		int count = sc.nextInt() / 1000;
		
		
		for(int i=0; i<count; i++) {
			set.clear();
	    	while(set.size() < 6) {
	    		set.add((int)(Math.random()*45)+1);
		}
	    	System.out.println(set);
		}
	}
}