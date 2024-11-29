package ex06_2_array;

public class TwoArrayExample99 {
	public static void main(String args[]) {
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };

		int[][] score = {
				{ 85, 60, 70 }, // 0행(1번학생)
				{ 90, 95, 80 }, // 1행(2번학생)
				{ 75, 80, 100 }, // 2행(3번학생)
				{ 80, 70, 95 }, // 3행(4번학생)
				{ 100, 65, 80 } // 4행(5번학생)								
		};
		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
		
		int c,r;
		
		for (c = 0; c < 3; c++) {
			for (r = 0; r < 5; r++) {
				subject[c] += score[r][c];
			}
			System.out.println(sub_name[c] + "의 총점=" + subject[c]);
		}
		for (c = 0;c < 5; c++) {
			for (r = 0;r < 3; r++) {
				student[c] += score[c][r];				
			}
			System.out.println(name[c] + "의 총점=" + student[c]);
		}
	}
}
