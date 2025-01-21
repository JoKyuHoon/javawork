package _01_thread;

class Thread1 extends Thread {
	@Override
	public void run() {
		setName("1번 스레드");   // 스레드 이름 변경
		for(int i=1; i<=5; i++) {
			System.out.println(getName());  // 조상 Thread의 이름 호출
		}
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		// setName() : Thread 클래스에 들어있는 메서드이기 때문에 setName("2번 스레드") 가 안됨.
		// Thread.currentThread() : 현재 실행되고 있는 스레드 얻어오기
		Thread.currentThread().setName("2번 스레드");
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());  // 조상 Thread의 이름 호출
		}
	}
	
	
	
}
public class T01_Thread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		
		Runnable r = new Thread2();
		Thread t2 = new Thread(r);  //  Thread(Runnable r)
		
		Thread t3 = new Thread(new Thread2());  // new Thread2() 객체가 Runnable인 부모타입으로 자동형변환이 되었기 때문에 가능
		
		t1.start();
		t2.start();
		
	}

}
