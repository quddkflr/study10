package ex67_Runnable_Interface_anonymous_util_function;

import java.util.ArrayList;

public class WildTest {
	public static void main(String[] args) {

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(Integer.valueOf(3));

		ArrayList<Double> list3 = new ArrayList<Double>();
		list3.add(10.1);
		list3.add(11.2);
		list3.add(12.3);

		printData(list2);
		printData(list3);
	}

	public static void printData(ArrayList<? extends Number> list) {
		for(Number a : list)
		System.out.println(a);
					
	}
}
