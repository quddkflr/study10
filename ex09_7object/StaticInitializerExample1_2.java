package ex09_7object;

public class StaticInitializerExample1_2 {
	public static void main(String args[]) {
		System.out.println("main 실행시작");
		HundredNumbers h = new HundredNumbers();
		HundredNumbers h2 = new HundredNumbers();
		
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[63]);
		
	}

}
