package ex52_HashSet;

import java.util.Arrays;
import java.util.TreeSet;

public class HashSet2_Generics_Lotto2_treeset2 {
	public static void main(String args[]) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		while (set.size() < 6) {
			int num = (int) (Math.random() * 45 + 1);
			set.add(num);		
		
		}
		System.out.println(set);
		
		Integer[] array = set.toArray(new Integer[set.size()]);
		
		System.out.println(Arrays.toString(array));
	}
	}
