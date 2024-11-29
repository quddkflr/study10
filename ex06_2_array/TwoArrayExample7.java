package ex06_2_array;

public class TwoArrayExample7 {
	public static void main(String args[]) {
		int table[][] = { { 10, 20 }, { 30, 40 }, { 50 } };

		for (int[] a : table) {
			for (int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}
