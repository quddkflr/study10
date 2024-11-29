package ex07_method;

public class MethodExample4 {
	public static void main(String[] args) {
		char data = '*';
		print(data);

	}

	// 메서드 정의
	public static void print(int parameter) {
		System.out.println("print() 메서드 입니다.");
		System.out.println("main() 메서드에서 전달받은 데이터의 값은 " + parameter + "입니다.");

	}
}
