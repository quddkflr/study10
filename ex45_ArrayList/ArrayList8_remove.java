package ex45_ArrayList;

import java.util.ArrayList;

public class ArrayList8_remove {
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
		
		list2.removeAll(list1);
		
		System.out.println(list1);
		System.out.println(list2);


	}

}
