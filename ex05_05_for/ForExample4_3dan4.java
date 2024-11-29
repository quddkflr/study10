package ex05_05_for;

import java.io.InputStream;
import java.util.Scanner;

public class ForExample4_3dan4 {
	public static void main(String args[]) {
		InputStream is = System.in;
		Scanner     sc = new Scanner(is);
		
		System.out.print("원하는 단을 입력하세요>");
		int dan = sc.nextInt();
		
		
		System.out.println("["+dan+"단]");
			for (int b = 1; b <= 9; b++) {
				System.out.println(dan + "*" + b + "=" + b * dan);

			}
		}

	}


