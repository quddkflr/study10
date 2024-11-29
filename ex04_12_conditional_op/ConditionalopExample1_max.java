package ex04_12_conditional_op;

public class ConditionalopExample1_max {
	public static void main(String args[]) {
		int a = 30, b = 10, max;
		
		System.out.println(a > b ? a : b);
		
		max = a > b ? a : b;
		System.out.println("최댓값 = " + max);
		
	}

}
