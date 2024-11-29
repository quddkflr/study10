package ex10_Exception;

public class ExceptionExample1_6 {
	public static void main(String args[]) {
		int result = add(1, -2);
		System.out.println(result);
	}
	
	static int add(int a, int b) throws Exception{
		int result = a + b;
		if (result < 0)
			throw new Exception("0보다 작아 에러 발생합니다.");
		return result;
	}
	}
