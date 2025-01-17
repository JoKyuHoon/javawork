package _05_map;

import java.util.HashMap;
import java.util.Scanner;

public class T02_HashMap {

	public static void main(String[] args) {
		// key = id, value = pw (3개를 hashmap에 넣기)
		HashMap<String, String> map = new HashMap();
		Scanner sc = new Scanner(System.in);
		
		map.put("dyaosdk00", "xkfprk00");
		map.put("qwer9141", "123456");
		map.put("myId", "pw123");
		
		// 사용자로부터 id와 pw를 입력받아서
				// id가 map에 있나 확인하고 없으면 '존재하지 않는 id입니다.'
				// id가 있으면 pw를 보고 
				// pw가 일치하면 '로그인 되었습니다.'
				// pw가 일치하지 않으면 '비밀번호가 틀렸습니다.' 
			
		while(true) {         // < for(;;) 으로도 가능 41번줄 continue 빼면 됨
		System.out.print("id 입력 : ");
		String id = sc.nextLine();
		
		
		if(map.containsKey(id)) {
			System.out.print("pw 입력 : ");
			String pw = sc.nextLine();
			
			String mapPw = map.get(id);
			if(pw.equals(mapPw)) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("존재하지 않는 id입니다");
			continue;
		}
	}
/*	
		if (map.containsKey(id)) {
  			if (!map.get(id).equals(pw)) {
  				System.out.println("비밀번호가 틀렸습니다");
  			} else {
  				System.out.println("로그인 성공");
  			}
  		} else {
  			System.out.println("존재하지 않는 아이디입니다.");
  		}

 */
	}
}
