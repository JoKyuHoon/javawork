package _06_ex;

public class Book {
	
//  속성
	String author;
	int ISBN;
	int price;
	
//  생성자	
	Book() {
		this("java", 97865, 15000);

		
	}
	
	Book(String author) {
		this(author, 97865, 15000);
	
	}
	
	Book(String author, int ISBN) {
	this(author, ISBN, 15000);

	}
	
	Book(String author, int ISBN, int price) {
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;	
	}
	
//  반환형이 있고 메소드 이름 들어가고 괄호 있음 >> 메소드	
	int sail(String name) {
		return 50000;
		
	}
	
	
}
