package _08_comparable;

import java.util.Arrays;
import java.util.Comparator;
// Comparable 인터페이스의 compareTo() 가 객체를 비교하기때문에 오버라이딩 되어있는 상태에서 사용
class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
//			return c1.compareTo(c2) * -1; >> 내림차순 정렬을 위해 * -1 을 해줌
//			return c1.compareTo(c2); 오름차순 정렬
			return c2.compareTo(c1); // 내림차순 정렬
			
 		}
		return -1;
	}
	
}
public class T02_Comparator {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		Arrays.sort(strArr);
		System.out.println("strArr=" + Arrays.toString(strArr));  // String의 Comparable구현에 의해 정렬(대문자가 앞에)
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);       // 대소문자 가리지 않음
		System.out.println("strArr=" + Arrays.toString(strArr)); 
		
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr=" + Arrays.toString(strArr));
	}


}
