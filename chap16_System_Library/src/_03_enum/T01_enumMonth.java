package _03_enum;

import java.util.Calendar;

public class T01_enumMonth {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		 int mon = calendar.get(Calendar.MONTH);
		
		 
		 Month_enum month = null;
		 
		 switch(mon) {

		  case 0: month = Month_enum.JANUARY; break;
          case 1: month = Month_enum.FEBRUARY; break;
          case 2: month = Month_enum.MARCH; break;
          case 3: month = Month_enum.APRIL; break;
          case 4: month = Month_enum.MAY; break;
          case 5: month = Month_enum.JUNE; break;
          case 6: month = Month_enum.JULY; break;
          case 7: month = Month_enum.AUGUST; break;
          case 8: month = Month_enum.SEPTEMBER; break;
          case 9: month = Month_enum.OCTOBER; break;
          case 10: month = Month_enum.NOVEMBER; break;
          case 11: month = Month_enum.DECEMBER; break;
          
		 }
		 System.out.println("현재: " + month);
		 
		 
	}

}
