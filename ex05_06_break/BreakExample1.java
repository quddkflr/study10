package ex05_06_break;

public class BreakExample1 {
	public static void main(String args[]) {
		
		for(int a = 0; a < 10; a++) {
			System.out.println(a);
			if (a == 5)
				break;
		}
		System.out.println("End.");
	}

}
