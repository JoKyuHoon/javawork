package _09_ex;

public class Fruit implements Comparable<Fruit> {
	String name;
	int price;
		
	public Fruit(String name, int price) {
			
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit name=" + name + ", price=" + price;
		}

	@Override
	public int compareTo(Fruit f) {
		if(price<f.price) return -1;
		else if(price == f.price) return 0;
		else return 1;
	}
}

