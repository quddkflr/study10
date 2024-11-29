package ex10_Exception;

public class ExceptionExample1_8 {
	public static void main(String args[]) {
		int result = devide(3, 0);
		System.out.println(result);
	
	}
	
	static int devid(int a, int b){
		int result = a / b;
		return result;
	}
}
