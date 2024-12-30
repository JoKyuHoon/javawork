package _01_operaition;

public class T02_increase {

	public static void main(String[] args) {
		// ++ : 하나증가
		// -- : 하나감소
		
		// 단일항일 때는 연산자가 앞이나 뒤나 상관없이 결과는 똑같다
		int num = 10;
		num++; // = 11;
		num--; // = 10;
		++num; // = 11;
		--num; // = 10;

		System.out.println(num);  // = 10
        // 항이 2개일때 연산을 하면 앞이나 뒤에 부튼것에 따라 결과가 달라진다		
		
		num = 10;
		int num2 = 10;
		
		// (++가)앞에붙으면 증가를 먼저 시킨다
		int result = ++num + ++num2;  // = 22
		
		System.out.println(result);
		
		// 증감연산자가 뒤에 붙으면 연산을 먼저하고 그 다음 나를 증가시킨다
		num = 10;
		num2 = 10;
		result = num++ + num2++;
		
		System.out.println("num=" + num + ", num2=" + num2);
		
		num = 10;
		num2 = 10;
		result = ++num + num2++;
		
		num = 10;
		num2 = 10;
		result = num-- + ++num2;
		
		num = 10;
		num2 = 10;
		result = --num + num2--;
		
		
	}

}
