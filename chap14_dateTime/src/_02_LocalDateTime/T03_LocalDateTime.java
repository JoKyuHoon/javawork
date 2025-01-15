package _02_LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startday = LocalDateTime.of(2024, 12, 30, 10, 0, 0);
		LocalDateTime endday = LocalDateTime.of(2025, 7, 21, 18, 30, 00);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh:mm:ss");
		System.out.println("시작일 : " + dtf.format(startday));
		System.out.println("종료일 : " + dtf.format(endday));
		
		if(today.isBefore(endday)) {
			System.out.println("수업중");
		}else if (today.isAfter(endday)) {
			System.out.println("수업종료");
			
		}else if(today.isEqual(endday)) {
			System.out.println("오늘 수업 종료날");
		}
	

	}

}
