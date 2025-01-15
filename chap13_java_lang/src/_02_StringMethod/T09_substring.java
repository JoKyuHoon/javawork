package _02_StringMethod;
// substring(fromIndex) : index번호부터 ~ 끝까지
// substring(fromIndex, endIndex) : fromIndex번호부터 ~ endIndex번호 까지 가져오기
public class T09_substring {

	public static void main(String[] args) {
		String str = "spring aws start";
		System.out.println(str.substring(7)); // < index번호 7인 a부터 끝까지 출력

		System.out.println(str.substring(7,10)); // < index번호 7~9까지 가져옴 (10번은 포함X)
		
		
		String sn = "030523-3245678";
		
		String gender = sn.substring(7,8);
		
		if(gender.equals("1") || gender.equals("3"))
			System.out.println("남자");
		else
			System.out.println("여자");
		
		
		
		int gender1 = Integer.parseInt(sn.substring(7,8)); // < int형으로 변환
		System.out.println(sn.substring(7,8));  // < 7번만 가져옴
		

		if(gender1==1 || gender1==3)
			System.out.println("남자");
		else
			System.out.println("여자");
		
		
		
		String m = sn.substring(2,4);
		String d = sn.substring(4,6);
		
		System.out.println("생일 : " + m + "월" + d + "일");
		
		
		int age = Integer.parseInt(sn.substring(0,2)); 
		
		System.out.println("나이 : " + (25 - age) + "세");
		
		
		
		int agesub = Integer.parseInt(sn.substring(0,2)); 
		
		int agesub2 = 0;
		
		if(agesub <= 25) {
			agesub2 = agesub + 2000;
		}else {
			agesub2 = agesub + 1900;
		}
			
		int age1 = 2025-agesub2;
		System.out.println("나이는 " + age1 + "세입니다.") ;
		
		
	}

}
