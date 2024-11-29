package ex35_Calendar_2;

import java.util.GregorianCalendar;

public class Main {
	public static void main(String[] args) {
		System.out.println("===== 오늘의 날짜 =====");
		Today t = new Today();
		System.out.println(t.toString());
		System.out.println(t);
		
		System.out.println("===== 특정 날짜 =====");
		GregorianCalendar g = new GregorianCalendar(2024,6,1);
		Today t2 = new Today(g);
		System.out.println(t2.toString());
		System.out.println(t2);
		
		System.out.println("===== 특정 날짜 =====");
		Today t3 = new Today(new GregorianCalendar(2024,6,1));	
		System.out.println(t3.toString());
		System.out.println(t3);
	}
	

}
