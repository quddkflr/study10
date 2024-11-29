package ex45_ArrayList;

import java.util.ArrayList;

public class ArrayList1_add2 {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("포도");
		list.add("딸기");
		list.add("복숭아");

		int num = list.size();

		for (int cnt = 0; cnt < num; cnt++) {

			String str = list.get(cnt);
			System.out.println(str);

		}
		System.out.println("===== 향상된 for 문 =====");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
