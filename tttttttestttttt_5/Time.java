package tttttttestttttt_5;

import java.util.Calendar;

public class Time {

	public static void main(String[] args) {

		while (true) {

			Calendar calendar = Calendar.getInstance();

			int y = calendar.get(Calendar.YEAR);

			int m = calendar.get(Calendar.MONTH) + 1;

			int d = calendar.get(Calendar.DAY_OF_MONTH);

			int yoil = calendar.get(Calendar.DAY_OF_WEEK);

			int h = calendar.get(Calendar.HOUR_OF_DAY);

			int mm = calendar.get(Calendar.MINUTE);

			int s = calendar.get(Calendar.SECOND);

			String[] yo = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

			String yyyy = yo[yoil - 1];

			System.out.println(y + "년 " + m + "월 " + d + "일 " + yyyy + " " +

					h + "시 " + mm + "분 " + s + "초");

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

		}

	}

}
