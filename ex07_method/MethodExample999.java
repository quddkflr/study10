package ex07_method;

import java.util.Scanner;

public class MethodExample999 {
	public static void main(String[] args) {

		System.out.println("두 개의 정수를 입력 하세요");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
        int max2 = max(n1,n2);
        int min2 = min(n1,n2);
        
        System.out.print("max = " + max2);
		System.out.print("min = " + min2);
		
	}

	public static int max(int a,int b) {
		return a>b?a:b;
		
	}

	public static int min(int a,int b) {
		return a<b?a:b;

		

	}
}
