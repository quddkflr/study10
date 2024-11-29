package ex51_Test;

import java.util.Set;
import java.util.TreeMap;

public class HashMap3_Generics {
	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<String, String>();
		
		tm.put("woman", "재미있니");
		tm.put("man", "좋은하루");
		tm.put("age", new String("10"));
		tm.put("city", "Seoul");
		tm.put("city", "Busan");
		
		System.out.println(tm);
		
		System.out.println(tm.keySet());
		
		System.out.println(tm.values());
		
		System.out.println(tm.get("woman"));
		System.out.println(tm.get("city"));
		
		System.out.println("======================");
		Set<String> keys = tm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + tm.get(key));
		}
	}
}
