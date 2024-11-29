package ex45_ArrayList;

import java.util.ArrayList;

public class ArrayList8_removeALL {
	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("봄");
		list1.add("여름");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("봄");
		list2.add("봄");
		list2.add("여름");
		list2.add("가을");
		list2.add("겨울");

		for (int i = 0; i < list2.size(); i++) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i--);
				System.out.println(list2);
			}
		}

		System.out.println("====== 삭제 후 =======");
		System.out.println(list1);
		System.out.println(list2);
	}
}
