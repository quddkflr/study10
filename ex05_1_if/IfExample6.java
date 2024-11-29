package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample6 {
	public static void main(String args[]) {
		InputStream is = System.in;
	    Scanner     sc = new Scanner(is);
	    
	    System.out.println("입력값>");
	    int num = sc.nextInt();
	    
	    if (num>=90) {
			System.out.println("A학점");
	    }else if (num<90 && num>=80) {
		    System.out.println("B학점");
		}else if (num<80 && num>=70) {
			System.out.println("C학점");
	    }else if (num<70 && num>=60){
		    System.out.println("D학점");
	    }else{
		    System.out.println("F학점");
}
	}
		
}

