package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample2 {
	public static void main(String[] args) {
        InputStream is = System.in;
	    Scanner     sc = new Scanner(is);
	    int num=sc.nextInt();
	    
	    	    	  		
		if (num>=1&&num<=10) {
			System.out.println("1~10 사이의 수 입니다.");
		}
		else {
			System.out.println("1~10 사이의 수가 아닙니다.");
		}
		
		sc.close();	
	 
	   
	    
		}
	}

