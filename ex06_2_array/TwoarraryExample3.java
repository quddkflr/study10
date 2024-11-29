package ex06_2_array;

public class TwoarraryExample3 {
	public static void main(String args[]) {
		int table[][] = new int[3][4];

		table[0][0] = 10;
		table[1][1] = 20;
		table[2][3] = table[0][0] + table[1][1];
for(int b=0; b<3;b++) 
		for (int a = 0; a < 4; a++) {
			
	
			System.out.println("table["+b+"][" + a + "] =" + table[b][a]);

		
	}
System.out.println("====================");
}
	}
