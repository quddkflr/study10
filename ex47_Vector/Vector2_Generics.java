package ex47_Vector;

import java.util.Vector;

public class Vector2_Generics {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
	
		for(String str : vec) {
			
		System.out.println(str+"=>"+str.toUpperCase());
		
		}
	}

}
