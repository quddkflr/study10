package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample6_2 {
	public static void main(String args[]) {
		InputStream is = System.in;
	    Scanner     sc = new Scanner(is);
	    
	    System.out.println("입력값>");
	    int num = sc.nextInt();
	    int mok = num/10;
	    	
	  
	    
	    if (mok == 9 || mok == 10) {
			System.out.println("A학점");
	    }else if (mok==8) {
		    System.out.println("B학점");
		}else if (mok==7) {
			System.out.println("C학점");
	    }else if (mok==6){
		    System.out.println("D학점");
	    }else{
		    System.out.println("F학점");
}
	}
		
}

