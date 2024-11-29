package ex66_Runnable_Interface_anonymous_ramda;

public class RamdaExample1 {
	public static void main(String args[]) {
		Parse p;
		
		p = new Parse() {

			@Override
			public int toInt(String x) {
				return Integer.parseInt(x);
			}
			
		};
		System.out.println(p.toInt("100"));
		
		p = (String x) -> {
			return Integer.parseInt(x);
		};
		System.out.println(p.toInt("200"));
		
		p = (x) -> {
			return Integer.parseInt(x);
		};
		System.out.println(p.toInt("300"));
		
		p = x -> {
			return Integer.parseInt(x);
		};
		System.out.println(p.toInt("400"));
		
		p = (String x) -> Integer.parseInt(x);		
		System.out.println(p.toInt("500"));
		
		p = (x) -> Integer.parseInt(x);		
		System.out.println(p.toInt("600"));
		
		p= Integer::parseInt;
		System.out.println(p.toInt("600"));
		
		p = x -> Integer.parseInt(x);		
		System.out.println(p.toInt("700"));
	}

}
