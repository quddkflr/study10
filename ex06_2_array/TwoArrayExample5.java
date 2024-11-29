package ex06_2_array;

public class TwoArrayExample5 {
	public static void main(String args[]) {
		int table[][] = {
				{1, 2, 3, 4},
				{5, 6, 7},
				{8,9, 10 ,11, 12}
		};
				
				for(int a=0;a < table.length; a++) {
					for (int b = 0; b < table[a].length; b++) {
				
				
				System.out.println("table["+a+"][" + b + "] =" + table[a][b]);
		}
				}
	}
}

