package ex05_05_for;

public class ForExample4_3dan3 {
	public static void main(String args[]) {
		for (int dan = 2; dan <= 9; dan++) {

			System.out.println("[" + dan + "단]");

			for (int b = 1; b <= 9; b++) {
				System.out.println(dan + "*" + b + "=" + b * dan);

			}
		}

	}

}
