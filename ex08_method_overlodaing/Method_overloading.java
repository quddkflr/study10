package ex08_method_overlodaing;

public class Method_overloading {
	public static void main(String[] agrm) {
		print();
		print(10);
		print(10,'*');
		
	}
	// 매개변수 없는 메서드 - 1
	public static void print() {
		System.out.println("print() 메서드 입니다.");

	}

	// 매개변수 한 개를 갖는 메서드 - 2
	public static void print(int num) {
		System.out.println("print(int num) 메서드 입니다.");

	}
	// 매개변수 두 개를 갖는 메서드 - 3
	public static void print(int num,char data) {
		System.out.println("print(int num,char data) 메서드 입니다.");
}
	//매개변수 두 개를 갖는 메서드 - 위와 다른점은 매개변수 자료형의 순서가 다릅니다. - 4
	public static void print(char num, int data) {
		System.out.println("print(char num,int data) 메서드 입니다.");
	}
	// 3번과 동일한 메서드로 취급합니다.
	//Duplicate method print(int, char) in type method+overloading
	
	//public static String print(int num, char data) {
		//System.out.println("print(int num,char data) 메서드 입니다.");
}

