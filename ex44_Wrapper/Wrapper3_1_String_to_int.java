package ex44_Wrapper;

public class Wrapper3_1_String_to_int {
	public static void main(String args[]) {
		int total = 0;
		for(int cnt = 0; cnt < args.length; cnt++) {			
			System.out.println("args[" + cnt + "]=" + args[cnt]);
			
			Integer obj = Integer.valueOf(args[cnt]);
			
			total += obj.intValue();
		}
		System.out.println("합 = " + total);
	}

}

