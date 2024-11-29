package ex05_06_break;

import java.util.Scanner;

public class BreakExample4 {
	public static void main(String args[]) {
		
Scanner sc = new Scanner(System.in);
		
		String fo ="";
			for (;;)
			{
				System.out.println("두 수와 사칙연산 연산자를 입력하세요~");
				System.out.print("수1>");
				int num1 = sc.nextInt();
				System.out.print("수2>");
				int num2 = sc.nextInt();
				System.out.print("연산자>");
				fo = sc.next();
				
				switch (fo) {
				case "+" : System.out.println(num1+"+"+num2+"="+(num1+num2)); 
						break;
				case "-" : System.out.println(num1+"-"+num2+"="+(num1-num2));
						break;
				case "*" : System.out.println(num1+"*"+num2+"="+(num1*num2));
						break;
				case "/" : System.out.println(num1+"/"+num2+"="+(num1/num2));
					 	break;
				case "%" : System.out.println(num1+"%"+num2+"="+(num1%num2));
				}
				System.out.println("계속 입력 하시겠습니까? (N(n)이면 종료. 그 외 문자는 계속 입력 가능");
				String co = sc.next();
				
				if (co.equals("n") || co.equals("N") )
				{
					break;
				}
				
		}
			System.out.println("끝");
	}
}
