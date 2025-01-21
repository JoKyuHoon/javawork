package _03_enum;

public class T02_enumNews {

	public static void main(String[] args) {
		News_enum news1 = News_enum.EAST;
		News_enum news2 = News_enum.valueOf("WEST");
		News_enum news3 = News_enum.valueOf(News_enum.class, "EAST");
		
		System.out.println("nuew1 = " + news1);
		System.out.println("nuew2 = " + news2);
		System.out.println("nuew3 = " + news3);
		
		System.out.println("news1 == news2 ? "+(news1==news2));
		System.out.println("news1 == news3 ? "+(news1==news3));
		System.out.println("news1.equals(news3) ? "+(news1.equals(news3)));
		
//		News_enum[] newsArr = News_enum.values();  << 배열에 넣는것도 가능 for(News_enum n : newsArr)
		for(News_enum n : News_enum.values())   // << 향상된 for 문
			System.out.println(n);
		
		System.out.println("-------");
		
		for(News_enum n : News_enum.values())   // << 향상된 for 문
			System.out.println(n.name());
			
			
	}

}
