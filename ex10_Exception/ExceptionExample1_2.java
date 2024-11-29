package ex10_Exception;

public class ExceptionExample1_2 {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		try {
		int result = num1 / num2;
		System.out.println(result);
	}catch (java.lang.ArithmeticException e) {
		System.out.println("0으로 나누지 마세요~");
	}
	}
}
