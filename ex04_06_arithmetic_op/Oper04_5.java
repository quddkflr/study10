package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper04_5 {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		
		Scanner     sc = new Scanner(is);
	int data = 5;
	int pandan = data % 3;
	
	System.out.print("정수를 입력 하세요>");
	int a = sc.nextInt();
	
			
	
	if (pandan == 0) {
		System.out.println(data + "은(는) 3배수 입니다.");
	}else {
		System.out.println(data + "은(는) 3배수가 아닙니다.");
	}
	}
}
