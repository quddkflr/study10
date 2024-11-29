package ex09_7object;

public class Accumulator_make {
	public static void main(String args[]) {
	    int grandTotal = Accumulator.getGrandTotal();
	    
		System.out.println("총계 = " + grandTotal);		
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		grandTotal = Accumulator.getGrandTotal();
		System.out.println("obj1.total = " + obj1.total);
		System.out.println("obj2.total = " + obj2.total);
		System.out.println("총계 = " + grandTotal);
		
		
		

	}

}
