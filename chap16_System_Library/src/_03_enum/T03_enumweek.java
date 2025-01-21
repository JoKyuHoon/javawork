package _03_enum;

import java.util.Calendar;

public class T03_enumweek {

	public static void main(String[] args) {
		
		
		Calendar today = Calendar.getInstance();
		int week = today.get(Calendar.DAY_OF_WEEK);
		
		
		if(week == 1) 
			System.out.println("일요일엔 짜파게티랑 파김치랑 계란후라이 먹는날");
		else 
			System.out.println("아주 열..심히..자바공부하는..날..");
		
		
		
		if(week == 1) 
			System.out.println("일요일엔 짜파게티랑 파김치랑 계란후라이 먹는날");
		else if (week == 2) 
			System.out.println("아주 열..심히..자바공부하는..날..");
		else if (week == 3) 
			System.out.println("아주 열..심히..자바공부하는..날..");
		else if (week == 4) 
			System.out.println("아주 열..심히..자바공부하는..날..");
		else if (week == 5) 
			System.out.println("아주 열..심히..자바공부하는..날..");
		else if (week == 6) 
			System.out.println("아주 열..심히..자바공부하는..날..");
		else 
			System.out.println("아주 열..심히..자바공부하는..날..");
		
		
		
		switch(week) {
		case 1:
			System.out.println("일요일은 짜파게티 먹는날");
			break;
		case 2:
			System.out.println("자바공부하는날");
			break;
		
		case 3:
			System.out.println("자바공부하는날");
			break;
		
		case 4:
			System.out.println("자바공부하는날");
			break;
		
		case 5:
			System.out.println("자바공부하는날");
			break;
		
		case 6:
			System.out.println("자바공부하는날");
			break;
			
		case 7:
			System.out.println("자바공부하는날");
		}
		
		
		
	}

}
