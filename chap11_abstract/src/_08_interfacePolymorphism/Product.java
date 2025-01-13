package _08_interfacePolymorphism;

public interface Product {
// interface는 객체생성 불가능함
	// 전원을 켜고 끄는 추상 메서드
	
    void power();
    int volume(int volume);
    int channel(int channel);
    
    
    
    
    static void AIspeak(String str){
    	System.out.println(str);
    }
    
    
    default void search(String search) {
    	System.out.println(search);
    }
    
}
	
		   
		   
		   
		      
	

