package ex06_1_array;

import java.io.InputStream;
import java.util.Scanner;

public class ArrayTest2_init8 {
	public static void main(String[] args) {
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		int data[] = {20,30,40,80,10};
		
		int max = data[0];
		int min = data[0];

		

		for (int a = 0; a < data.length; a++) {
             if (max < data[a]) max = data[a];
             if (min > data[a]) min = data[a];
             
						
		}	
		System.out.println("max = " + max);
		System.out.println("min = " + min);
					}
	}
