package _02_abstractPhone;

public class Phone_main {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("애플", "스그");
//		System.out.println(sp.model);
//		System.out.println(sp.color);
		
		sp.bell();
		sp.bell();
		sp.hangUp();
		sp.sendVoice("안녕하세요");
		sp.receiveVoice("그래");
		sp.hangOut();
		
		FolderPhone fp = new FolderPhone("애플", "스그");
		
		System.out.println("--------Folder---------");
		
		fp.hangUp();
		fp.hangOut();
		
	}

}
