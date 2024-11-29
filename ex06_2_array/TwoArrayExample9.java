package ex06_2_array;

public class TwoArrayExample9 {
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
		
		for(int a = 0; a < score.length; a++) {
			subject[0] = score[a][0] + subject[0];
	}
		System.out.println(sub_name[0]+"의 총점 ="+ subject[0]);
		
		//for(int a = 0; a < score.length; a++) {
			//subject[1] = score[a][1] + subject[1];
	
		//System.out.println(sub_name[1]+"의 총점 ="+ subject[1]);
		//for(int a = 0; a < score.length; a++) {
			//subject[2] = score[a][2] + subject[2];
	//}
		//System.out.println(sub_name[2]+"의 총점 ="+ subject[2]);
	for(int b = 0; b < sub_name.length; b++) {
		student[0] = score[0][b] + student[0];
}
	System.out.println("강호동의 총점 ="+ student[0]);
}	
}
//}
