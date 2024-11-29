package ex05_2_switch;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchExample2_1_char3 {
	public static void main(String args[]) {
		InputStream is = System.in;
	    Scanner     sc = new Scanner(is);
	    
	    System.out.println("입력값>");
	    int num = sc.nextInt();
	    int mok= num/5;
		
		switch (mok) {
		case 20:
		case 19:
			System.out.println("A+");
			break;
			
		case 18:		
			System.out.println("A0");
			break;
			
		case 17:
			System.out.println("B+");
			break;
			
		case 16 :
			System.out.println("B0");
			break;
			
		case 15 :
			System.out.println("C+");
			break;
			
		case 14 :			
			System.out.println("C0");
			break;
			
		case 13 :
			System.out.println("D+");
			break;
			
		case 12 :
			System.out.println("D0");
			break;
			
			default :
		    System.out.println("F");
		
		   
							
			}
		System.out.println("끝.");
		
	}

}
