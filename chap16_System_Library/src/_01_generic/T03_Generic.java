package _01_generic;

import java.util.ArrayList;

class Fruit {public String toString() {return "Fruit";}}
class Apple1 extends Fruit {public String toString() {return "Apple1";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Tjoeun {public String toString() {return "Tjoeun";}}
class Box1<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int index) {
		return list.get(index);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}


public class T03_Generic {

	public static void main(String[] args) {
		Box1<Fruit> fruitBox1 = new Box1<>();
		Box1<Apple1> Apple1Box1 = new Box1<>();
		Box1<Tjoeun> tjoeunBox1 = new Box1<>();
		
		fruitBox1.add(new Fruit());	// 자신의 타입 넣음
		fruitBox1.add(new Apple1());  // 자식의 타입을 부모타입으로 자동형변환이 되어 넣음
		fruitBox1.add(new Grape());  // 자식의 타입을 부모타입으로 자동형변환이 되어 넣음
//		Apple1Box1.add(new Tjoeun()); // 오류 : 타입이 맞지 않음
		
		Apple1Box1.add(new Apple1());	// Apple1타입만 넣을 수 있다
		Apple1Box1.add(new Apple1());	// Apple1타입만 넣을 수 있다
//		Apple1Box1.add(new Fruit());	// 오류 : 타입이 맞지 않음
		
		tjoeunBox1.add(new Tjoeun()); // Tjoeun만 넣을 수 있다
		
		System.out.println(fruitBox1);
		System.out.println(Apple1Box1);
		System.out.println(tjoeunBox1);
		
		
	}

}
