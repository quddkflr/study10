package ex06_1_array;

import java.io.InputStream;
import java.util.Scanner;

public class ArrayTest2_init7 {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		int num[] = new int [5];

		int ss = 0;

		for (int a = 0; a < num.length; a++) {

			System.out.print("정수를 입력 하세요>");
			 num[a] = sc.nextInt();
			ss = num[a]+ss;
			

		}

		System.out.println("합=" + ss);
		System.out.println("평균="+ ss/5.0 );
		
	}
}