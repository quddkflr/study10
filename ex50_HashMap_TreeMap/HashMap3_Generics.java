package ex50_HashMap_TreeMap;

import java.util.HashMap;
import java.util.Set;

public class HashMap3_Generics {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("woman", "재미있니");
		hm.put("man", "좋은하루");
		hm.put("age", new String("10"));
		hm.put("city", "Seoul");
		hm.put("city", "Busan");
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
		
		System.out.println("======================");
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + hm.get(key));
		}
	}

}
