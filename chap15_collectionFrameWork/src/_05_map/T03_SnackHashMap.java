package _05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class T03_SnackHashMap {
	public static void main(String[] args) {
		HashMap<String, Snack> map = new HashMap<>();

		map.put("새우깡", new Snack("새우맛", 300));
		map.put("홈런볼", new Snack("홈런볼맛", 400));
		map.put("프링글스", new Snack("개맛있는맛", 450));
		map.put("바나나킥", new Snack("바나나맛", 300));
		
		map.put("바나나킥", new Snack("바나나맛", 1000));
		System.out.println(map);
		
		Snack snack = map.get("새우깡");
		System.out.println(snack);
		
		//replace(key, value)
		map.replace("홈런볼", new Snack("초코맛", 350));
		System.out.println(map);
		
		// 객체를 하나씩 출력
		// entrySet()
//		Set entry = map.entrySet();
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		Iterator<Entry<String, Snack>> iter = entrySet.iterator();
		while(iter.hasNext()) {
			Entry<String, Snack> entry = iter.next();
			
			String key = entry.getKey();
			Snack value =entry.getValue();
			System.out.println(key + " - " + value);
		}
	}
}