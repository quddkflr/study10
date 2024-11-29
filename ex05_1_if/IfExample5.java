package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample5 {
	public static void main(String args[]) {
		InputStream is = System.in;
	    Scanner     sc = new Scanner(is);
	    
	    System.out.println("입력값>");
	    int num = sc.nextInt();
	    
	    if (num<10) {
			System.out.println("num의 값은 10 미만입니다.");
	    }	else	if (num<100) {
				System.out.println("num의 값은 10이상, 100 미만입니다.");
		}
	    else	if (num<1000) {
			System.out.println("num의 값은 100이상, 1000 미만입니다.");
	}else {
		System.out.println("num의 값은 1000 이상입니다.");
}
	}
		
}

