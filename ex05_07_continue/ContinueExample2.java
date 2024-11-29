package ex05_07_continue;

public class ContinueExample2 {
	public static void main(String args[]) {
		
		int cnt = -1;
		while (cnt++ < 10) {
			if (cnt == 5)
				continue;
			System.out.println(cnt);
			
		}
		System.out.println("끝.");
		}
	

}
