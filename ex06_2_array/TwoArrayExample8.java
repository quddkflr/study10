package ex06_2_array;

public class TwoArrayExample8 {
	public static void main(String args[]) {
		String arr[][] = { { "과일","사과" },
				           { "아이스크림","메로나" },
				           { "커피" } };

		//for (String[] a : arr) {
			//for (String n : a) {
				//System.out.print(n + " ");
			//}
		for(String[] i : arr) {
			for (String n : i)
				System.out.printf("%s\t" , n);
			System.out.println();
		}
		}
	}

//}
