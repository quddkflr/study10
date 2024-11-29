package ex07_method;

import java.util.Scanner;

public class MethodExample99 {
	public static int input() {

		System.out.println("정수를 입력 하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		return a;
	}

	public static int abs(int data) {
		if (data < 0)
			data = -data;
		return data;
	}

	public static void main(String[] args) {
		int inputdata = input();
		int result = abs(inputdata);

		System.out.print("절대값 : " + result);

	}
}
