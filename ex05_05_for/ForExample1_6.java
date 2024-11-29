package ex05_05_for;

public class ForExample1_6 {
	public static void main(String args[]) {
		
		int a;				
		int sum = 0;
	
		for ( a = 2; a <= 10;a++ ) {
			sum = sum + a;
			a= a+1;
		}
		System.out.println(sum);
		
		
	}

}
