package ex36_DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatExample2 {
	public static void main(String args[]) {
		GregorianCalendar calendar = new GregorianCalendar();		
		//calendar.getTime();
		System.out.println(calendar.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초 E요일");
		System.out.println(sdf.format(calendar.getTime()));

	}

}
