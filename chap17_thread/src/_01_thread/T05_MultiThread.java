package _01_thread;


class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.print("|");
	
		}
		System.out.println();
		System.out.println("myThread 소요시간 : " + (System.currentTimeMillis()-T05_MultiThread.startTime));
	}
}

public class T05_MultiThread {
	static long startTime = 0;
	
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++) {
			System.out.print("@");
		}
		System.out.println();
		System.out.println("mainThread소요시간 : "+ (System.currentTimeMillis()-T05_MultiThread.startTime));
		
	}

}
