package ex05_06_break;

public class BreakExample2 {
	public static void main(String args[]) {
		for(int b = 0; b < 3; b++) {
		for(int a = 0; a < 5; a++) {
			System.out.println("("+b+","+a+")");
			if ((b==1)&&(a==2))
				break;
		}
		}
		System.out.println("끝.");
	}

	}
