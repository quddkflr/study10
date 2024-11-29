package ex06_1_array;

import java.io.InputStream;
import java.util.Scanner;

public class ArrayTest2_init9 {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		int data[] = new int[5];

		System.out.println("정수 5개를 입력하세요?");
		data[0] = sc.nextInt();
		

		int max = data[0];
		int min = data[0];

		for (int a = 1; a < data.length; a++) {
			data[a] = sc.nextInt();
			if (max < data[a])
				max = data[a];
			if (min > data[a])
				min = data[a];

		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
