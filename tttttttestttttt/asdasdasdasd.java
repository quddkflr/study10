package tttttttestttttt;

public class asdasdasdasd {
	public static void main(String[] args) {
		int a[] = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int imsi = a[i];
					a[i] = a[j];
					a[j] = imsi;
				}
			}
		}
		System.out.println("정렬 후 데이터 :");
		for (int data : a) {
			System.out.print(data + "\t");
		}
	}
}
