package ex05_07_continue;

public class ContinueExample {
	public static void main(String args[]) {
		
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt != 5)
				System.out.println(cnt);
		}
		System.out.println("============");
		
		for (int cnt = 0; cnt < 10; cnt++) {
			if (cnt == 5)
				continue;
			
			System.out.println(cnt);
		}
		System.out.println("End.");
		}
	

}
