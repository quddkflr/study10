package ex44_Wrapper;

public class Wrapper7_auto_boxing {
	public static void main(String ars[]) {
		printDouble(123.45);
	}
	static void printDouble(Double obj) {
		System.out.println("obj.doubleValue() = "+obj.doubleValue());
		System.out.println("obj.toString() = "+obj.toString());
	}

}
