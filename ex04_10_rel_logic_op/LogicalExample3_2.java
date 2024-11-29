package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample3_2 {
	public static void main(String args[]) {
		InputStream is = System.in;
	    Scanner     sc = new Scanner(is);
	    int num=sc.nextInt();
	    
	    if (num>=1 && num <=9) {
			System.out.println("10세 미만");
		}else {
			System.out.println(num/10 * 10 + "대");
		
				
		}sc.close();
		
	}

}
