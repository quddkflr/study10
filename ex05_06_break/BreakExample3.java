package ex05_06_break;

public class BreakExample3 {
	public static void main(String args[]) {
		
		outerLoop:
		for(int b = 0; b < 3; b++) {
		for(int a = 0; a < 5; a++) {
			System.out.println("("+b+","+a+")");
			if ((b==1)&&(a==2))
				break outerLoop;
		}
		}
		System.out.println("끝.");
	}

	}
