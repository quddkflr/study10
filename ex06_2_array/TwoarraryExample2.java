package ex06_2_array;

public class TwoarraryExample2 {
	public static void main(String args[]) {
		int table[][] = new int[3][4];

		table[0][0] = 10;
		table[1][1] = 20;
		table[2][3] = table[0][0] + table[1][1];

		for (int a = 0; a < 4; a++) {

			System.out.println("table[0][" + a + "] = " + table[0][a]);

		}
		for (int a = 0; a < 4; a++) {

			System.out.println("table[1][" + a + "] = " + table[1][a]);
		}
		for (int a = 0; a < 4; a++) {

			System.out.println("table[2][" + a + "] = " + table[2][a]);
		}
		System.out.println("====================");
	}
}
