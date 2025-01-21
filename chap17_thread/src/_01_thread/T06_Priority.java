package _01_thread;
class Thread3 extends Thread {
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.print("방");
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}

class Thread4 extends Thread {
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.print("생");
		}
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}

public class T06_Priority {

	public static void main(String[] args) {
		 Thread t3 = new Thread3();
		 Thread t4 = new Thread4();

		 System.out.println("우선순위가 가장 높은 값 : " + Thread.MAX_PRIORITY); // (10)우선순위가 가장 높음
		 System.out.println("우선순위가 가장 낮은 값 : " + Thread.MIN_PRIORITY); //  (1)우선순위가 가장 낮음
		 System.out.println("우선순위 default값 : " + Thread.NORM_PRIORITY);//  (5)default
		 System.out.println(); 
		
		 t3.setPriority(10);
		 t4.setPriority(1);
		 System.out.println("우선순위(z) : " + t3.getPriority());
		 System.out.println("우선순위(ㅋ) : " + t4.getPriority());
		 t3.start();
		 t4.start();
		 
	}
}
