package _05_interfaceExtedns;
/*
 * Interface 사이에서도 상속사능, 다중상속 가능
 */
interface Inter1 {
	int method1();
}
interface Inter2 {
	int method2();
}

public interface Inter extends Inter1, Inter2{
	int method();
	
}
