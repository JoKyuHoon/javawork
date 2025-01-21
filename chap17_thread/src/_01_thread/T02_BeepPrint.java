package _01_thread;

import java.awt.Toolkit;

public class T02_BeepPrint {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for(int i1=0; i1<5; i1++) {
				System.out.println("띵");
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			}
			
		}
	}
}
