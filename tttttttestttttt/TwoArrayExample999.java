package tttttttestttttt;

public class TwoArrayExample999 {
	public static void main(String args[]) {
		int[][] score = { { 85, 60, 70 },

				{ 90, 95, 80 },

				{ 75, 80, 100 },

				{ 80, 70, 95 },

				{ 100, 65, 80 } };

		int[] hap = new int[score[0].length];

		System.out.println("========== 학생별   /  과목별 총점구하기  ==========");

		System.out.println("\t국어\t수학\t영어\t총점\t평균");

		for (int i = 0; i < score.length; i++) {

			int a = 0;

			System.out.print(name(i));

			for (int j = 0; j < score[i].length; j++) {

				a += score[i][j];

				System.out.print("\t" + score[i][j]);

				hap[j] += score[i][j];

			}

			int b = a / 3;

			System.out.println("\t" + a + "\t" + b);

		}

		System.out.println("=============================================");

		System.out.print("총점=");

		for (int c : hap) {

			System.out.print("\t" + c);

		}

	}

	public static String name(int name) {

		String[] student = { "강호동", "이승기", "유재석", "하하", "이광수" };

		return student[name] + "";

	}

}
