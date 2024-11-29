package ex73_File;

import java.io.File;
import java.util.GregorianCalendar;

public class FileExample1_0 {
	public static void main(String args[]) {
		
		File file = new File(".");
		
		File arr[] = file.listFiles();
		
		for (int cnt = 0; cnt < arr.length; cnt++) {
			String name = arr[cnt].getName();
			
			if (arr[cnt].isFile())
				System.out.printf("%-25s %7d \t", name,arr[cnt].length());
			else
				System.out.printf("%-25s    <DIR> \t", name);
			
			long time = arr[cnt].lastModified();
			System.out.printf("%d\n", time);
			
			GregorianCalendar calendar = new GregorianCalendar();
			
			calendar.setTimeInMillis(time);
			
			System.out.printf("%tF %tT \n", calendar, calendar);
		}
	}

}
