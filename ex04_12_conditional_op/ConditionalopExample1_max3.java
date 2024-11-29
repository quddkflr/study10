package ex04_12_conditional_op;

import java.io.InputStream;
import java.util.Scanner;
public class ConditionalopExample1_max3 {
	public static void main(String args[]) {
		InputStream is = System.in;
	    Scanner sc = new Scanner(is);
	    
	    
        System.out.println("3개의 정수를 입력 하세요?");
	    int num1 = sc.nextInt();
	    int num2 = sc.nextInt();
	    int num3 = sc.nextInt();
	    
	    int max = num1 > num2 ? num1 : num2;	    	    
	    max = max > num3 ? max : num3;
	
	    	    
	    System.out.println(num1+","+num2+","+num3+"중 가장 큰 수는"+max+"입니다.");
	    
	    int min = num1 < num2 ? num1 : num2;
	    min = min < num3 ? min : num3;
	    
	    System.out.println(num1+","+num2+","+num3+"중 가장 작은 수는"+min+"입니다.");
	    
	    
	    
		
	}

}
