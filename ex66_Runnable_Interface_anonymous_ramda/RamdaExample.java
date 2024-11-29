package ex66_Runnable_Interface_anonymous_ramda;

public class RamdaExample {
	public static void main(String args[]) {
		Negative n;

		n = new Negative() {

			public int neg(int x) {
				return -x;
			}

		};
		System.out.println(n.neg(-10));

		n = (int x) -> {
			return -x;
		};
		System.out.println(n.neg(-20));

		n = (x) -> {
			return -x;
		};
		System.out.println(n.neg(-30));
		
		n = x -> {
			return -x;
		};
		System.out.println(n.neg(-40));
		
		
		n = (int x) -> -x ;		
		System.out.println(n.neg(-50));
		
		
		n = (x) -> -x ;		
		System.out.println(n.neg(-60));
		
		
		n = x -> -x ;		
		System.out.println(n.neg(-70));
		
	}
}