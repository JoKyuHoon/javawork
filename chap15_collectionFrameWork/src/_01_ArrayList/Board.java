package _01_ArrayList;

public class Board {
	private String subject;
	private String writer;
	private int price;
	
	// 생성자 2개
	// 빈 생성자
	// 모든 필드가 있는 생성자
	Board() {
		
	}
	
	Board(String subject, String writer, int price) {
		this.subject = subject;
		this.writer = writer;
		this.price = price;
	}
	
	// 각 필드의 setter/getter메서드
	public void setSubject(String subject) {
        this.subject = subject;
    }
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	// toString 오버라이딩
	// 제목 : ???, 글쓴이 : ???, 가격 : ???
	
	
}
