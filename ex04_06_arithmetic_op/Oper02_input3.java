package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input3 {
	public static void main(String[] args) {
	
	InputStream is = System.in;
	
	Scanner     sc = new Scanner(is);
	
	System.out.print("두 정수를 입력 하세요>");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	System.out.printf("%-5d +  %5d  =%-5d%n",a,b,a+b);
	
	
    System.out.printf("%-5d -  %5d  =%-5d%n",a,b,a-b);
	
	
	System.out.printf("%-5d *  %5d  =%-5d%n",a,b,a*b);
	
	
	System.out.printf("%-5d /  %5d  =%-5d%n",a,b,a/b);
	
	
	System.out.printf("%-5d %%  %5d  =%-5d%n",a,b,a%b);
	
	
	sc.close();

	
	}
}
