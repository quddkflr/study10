package ex35_Calendar;

import java.util.Calendar;

public class Calendar2 {
	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();
		
		System.out.print(today.get(1)+"년 ");
		
		System.out.print((today.get(Calendar.MONTH) + 1)+"월 ");

		System.out.print( today.get(Calendar.DAY_OF_MONTH)+"일 ");
		
		if(today.get(Calendar.AM_PM) == 1)
		System.out.print("오후 ");
		else
		System.out.print("오전 ");	
		
		System.out.print(today.get(Calendar.HOUR)+":");

		System.out.print(today.get(Calendar.MINUTE)+":");

		System.out.print(today.get(Calendar.SECOND));
		if(today.get(Calendar.DAY_OF_WEEK)==5)
		System.out.print(" 목요일입니다.");
		else if(today.get(Calendar.DAY_OF_WEEK)==1)
		System.out.print(" 일요일입니다.");
		else if(today.get(Calendar.DAY_OF_WEEK)==2)
			System.out.print(" 월요일입니다.");
		else if(today.get(Calendar.DAY_OF_WEEK)==3)
			System.out.print(" 화요일입니다.");
		else if(today.get(Calendar.DAY_OF_WEEK)==4)
			System.out.print(" 수요일입니다.");
		else if(today.get(Calendar.DAY_OF_WEEK)==6)
			System.out.print(" 금요일입니다.");
		else
			System.out.print(" 토요일입니다.");
	}

}
