package _09_ex;

import java.util.Iterator;
import java.util.TreeSet;	
	
public class Comparator_main {

	public static void main(String[] args) {

		TreeSet<Fruit> treeSet = new TreeSet<>();
		
		treeSet.add(new Fruit("바나나", 6000));
		treeSet.add(new Fruit("사과", 1000));
		treeSet.add(new Fruit("파인애플", 9800));
		
		System.out.println(treeSet);
		
		
		
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit f = iterator.next();
			System.out.println(f.name + ":" + f.price);
		}
	}
}
