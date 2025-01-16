package _02_StringMethod;

// startWith(String) : 문자로 시작하는지 boolean으로 반환
// endWith(String)   : 문자로 끝나는지 boolean으로 반환
public class T04_endWith {

	public static void main(String[] args) {
		String str = "javahtmlcssoracle";     
		
		System.out.println(str.startsWith("java"));
		
		if(str.startsWith("java"))
			System.out.println("java부터 배웁니다.");
		else
			System.out.println("다른언어부터 배웁니다.");
		
		
		String str2 = "img.png";
		
		if(str2.endsWith("png")|| str2.endsWith("jpg"))
			System.out.println("그림파일 입니다.");
		else
			System.out.println("그림파일이 아닙니다.");
		
		

	}

}
