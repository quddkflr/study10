package ex07_method;

public class MethodExample9 {
	public static void main(String[] args) {
		hap(1, 10);
		//1.
		int result = hap(1,100);
		System.out.println("1: result =" + result);
		//2.
		System.out.println("출력문 안에서 호출 :" + hap(1,5));

	}

	// 메서드 정의

	public static int hap(int start, int end) {
		int sum = 0;
		for (int i = start; i <=end; i++) {
			sum += i;

		}
		return sum;
	}
}
