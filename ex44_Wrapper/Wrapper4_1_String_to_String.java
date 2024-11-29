package ex44_Wrapper;

public class Wrapper4_1_String_to_String {
	public static void main(String args[]) {
		int i = 10;
		
		String age = Integer.toString(i);
		
		String age2 = "" + i;
		
		System.out.println(age);
		System.out.println(age2);
	}
}
