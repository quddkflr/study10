package ex07_method;

public class MethodExample7 {
	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		print(num);
		return;

	}

	// 메서드 정의

	public static void print(int[] num) {
		for (int i = 0; i < num.length; i++) {

			System.out.print(num[i]+ " ");

		}
		return;
	}
}
