package _02_StringMethod;

//contains(String) : 문자열이 포함되어 있는지 boolean으로 반환
public class T03_contains {

	public static void main(String[] args) {
		String str = "java programing";
		
		boolean flag =  str.contains("pro");
		
		if(flag)
			System.out.println("'pro' 가 포함되어있습니다.");
		else
			System.out.println("'pro' 가 포함되어있지않습니다.");
	}

}
