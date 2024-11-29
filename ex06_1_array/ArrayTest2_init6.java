package ex06_1_array;

public class ArrayTest2_init6 {
	public static void main(String[] args) {
		
		int score[] = {95,70,80,75,100};
		
		int ss = 0;
					
		
		for (int a=0;a<score.length;a++) {
			
			ss = score[a]+ss;

			System.out.println("score[" + a + "]=" + score[a]);
		
	
	}
		
		System.out.println("총점=" + ss );
	}
}