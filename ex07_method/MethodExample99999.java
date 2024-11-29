package ex07_method;

import java.util.Scanner;

public class MethodExample99999 {
	public static void main(String[] args) {

		int[] data = input();
		
		

		int max2 = max(data);
		int min2 = min(data);

		System.out.println("max = " + max2);
		System.out.println("min = " + min2);

	}
	public static int max(int data[]) {
		int max=data[0];
		for(int b = 1; b<data.length;b++) {
			if(max < data[b]) {
				max=data[b];
								
			}			
		}return max;
	}
	public static int min(int data[]) {
		int min=data[0];
		for(int c = 1; c>data.length;c--) {
			if(min < data[c]) {
				min=data[c];
								
			}			
		}return min;
	}

	public static int[] input() {
		System.out.println("다섯 개의 정수를 입력 하세요");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		int[] data = new int[5];
		for (int a = 0; a < data.length; a++) {
			data[a] = sc.nextInt();

		}
		return data;
	}

}
