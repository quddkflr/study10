package ex10_Exception;

public class ExceptionExample1_1 {
	public static void main(String args[]) {
		int sum = 1+ -2;
		try {
		if (sum < 0) {
		
		throw new Exception("에러 발생");
		}
		System.out.println(sum);
	} catch (Exception e) {
		System.out.println("[catch]" + e.getMessage());
	}
	}
}
