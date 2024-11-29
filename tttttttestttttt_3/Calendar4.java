package tttttttestttttt_3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar4 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("출력할 년도를 입력하세요 > ");
		int year = sc.nextInt();
		System.out.println("출력할 월을 입력하세요 > ");
		int month = sc.nextInt();
		sc.close();

		String[] yo = { "일", "월", "화", "수", "목", "금", "토" };

		Calendar c1 = new GregorianCalendar(year, month - 1, 1);

		int y = c1.get(Calendar.YEAR);

		int m = c1.get(Calendar.MONTH) + 1;

		int yoil = c1.get(Calendar.DAY_OF_WEEK);

		int ma = c1.getActualMaximum(Calendar.DATE);

		System.out.println("\t" + y + "년 " + m + "월");

		for (int i = 0; i < yo.length; i++) {

			String day = yo[i];

			System.out.print(day + "\t");

		}
		System.out.println();
		System.out.println("====================================================");

		int first = (yoil - Calendar.SUNDAY + 7) % 7;

		for (int i = 0; i < first; i++) {

			System.out.print("\t");

		}

		for (int day = 1; day <= ma; day++) {

			System.out.print(day + "\t");

			if ((day + first) % 7 == 0) {

				System.out.println();

			}

		}

	}

}
