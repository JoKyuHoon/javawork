package _05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		// 객체 넣기 : put(key,value)
		map.put("두더지", 87);
		map.put("방생", 98);
		map.put("호구", 67);
		map.put("재윤씨", 79);
		System.out.println("총 entry 수 : " + map.size());
		
		// 객체 얻어오기
		System.out.println(map.get("호구"));
		System.out.println(map);
		System.out.println();
		
		// 객체 삭제 : remove(key)
		map.remove("재윤씨");
		System.out.println("재윤씨 삭제 후 : " + map);

		// 동일한 키로 값 넣기(기존의 값 변경)
		// 없는 키이면 삽입, 있는 키이면 변경
		map.put("호구", 100);
		System.out.println(map);
		map.put("방생", 0);
		System.out.println(map);
		System.out.println("-----------------------");
		
		// 객체 하나씩 출력 하려면 
		Set<String> keyset = map.keySet();
		Iterator<String> keyInter = keyset.iterator();
//		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		while(keyInter.hasNext()) {
			String key = keyInter.next();
			int value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
