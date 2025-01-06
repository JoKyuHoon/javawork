package _02_method;

public class T01_api_op {
	// 5칙 연산
	
	// 메소드 4개
	// +, -, *, % = 반환형(return) int형
	//      /     = 반환형 double 형
	
	// 매개변수 int형으로 2개 받기
	
	
	int add(int num1, int num2) {
		int re = num1 + num2;
		return re;
	}
	int sub(int num1, int num2) {
		int re1 = num1 - num2;
		return re1;
	}
	int mul(int num1, int num2) {
		int re2 = num1 * num2;
		return re2;
	}
	int rem(int num1, int num2) {
		int re3 = num1 % num2;
		return re3;
	}
	
	double div(double num1, double num2) {
		double re4 = num1 / num2;
		return re4;
	}
	
	
	
	
	
}
