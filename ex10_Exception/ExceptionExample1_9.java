package ex10_Exception;

public class ExceptionExample1_9 {
	public static void main(String args[]) {
		try {
		int result = devide(3, 0);
		System.out.println(result);
	
	}catch (Exception e) {
		System.out.println("에러 발생");
	}
	}
	
	static int devide(int a, int b){
		int result = a / b;
		return result;
	}
}
