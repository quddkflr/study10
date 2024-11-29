package ex44_Wrapper;

public class Wrapper1_boxing_unpoxing_deprecated {
	public static void main(String args[]) {
		
		Integer obj1 = new Integer(12);
		Integer obj2 = new Integer(7);
		
		int n1 = obj1.intValue();
		int n2 = obj2.intValue();
		int sum = n1 + n2;
		System.out.println(sum);
		
		Integer n02 = new Integer("20");
		
		int n3 = n02.intValue();
		sum = n1 + n2 + n3;
		System.out.println(sum);
	
	}

}

