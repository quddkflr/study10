package ex65;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_date extends Thread {

	public void run() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 E요일 HH시mm분ss초");
		for (;;) {
			Date d = new Date();
			System.out.println(s.format(d));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie.toString());
			}
		}
	}

}
