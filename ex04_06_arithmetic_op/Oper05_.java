package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper05_ {
	public static void main(String[] arms) {
		
InputStream is = System.in;
		
		Scanner     sc = new Scanner(is);
		
		System.out.print("정수1를 입력 하세요>");
		int a = sc.nextInt();
		System.out.print("정수2를 입력 하세요>");
		int b = sc.nextInt();
		System.out.print("연산자(+) 입력 하세요>");
		 String     c = sc.next();
		
		
		if (c.equals( "+")) {
			System.out.println(a+"+"+b+"="+(a+b));
		}else {
			System.out.println("+를 입력하세요");
		
	}
	}
}
