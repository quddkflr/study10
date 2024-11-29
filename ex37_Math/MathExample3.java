package ex37_Math;

public class MathExample3 {
	public static void main(String args[]) {

		// System.out.println(Math.random());
		// System.out.println(Math.random());
		// System.out.println(Math.random());

		int num[] = new int[6];

		// num = (int) (Math.random() * 10);
		// System.out.println(num);

		// System.out.println(Math.random());
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}

		}
		System.out.println("\n====================정렬 후====================");
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int imsi = num[i];
					num[i] = num[j];
					num[j] = imsi;
					
				}
			}
		}
		for(int k : num) {
			System.out.print(k+"\t");
	}
	}
}

