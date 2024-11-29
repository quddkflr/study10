package ex10_Exception;

public class ExceptionExample1_0 {
	public static void main(String args[]) {
		int sum = 1+ -2;
		if (sum < 0) {
		//throw는 에러를 발생시키는 키워드 입니다.
		throw new Exception("에러 발생");
		}
		System.out.println(sum);
	}

}
