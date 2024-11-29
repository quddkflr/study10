package ex40_Object_equals;

import java.util.GregorianCalendar;

public class ObjectExample {
	public static void main(String args[]) {
		GregorianCalendar obj1 = new GregorianCalendar(2021, 5, 2);
		GregorianCalendar obj2 = new GregorianCalendar(2021, 5, 2);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	
	if(obj1==obj2)
		System.out.println("obj1=obj2 : 같음");
	else
		System.out.println("obj1=obj2 : 다름");
	
	if(obj1.equals(obj2))
		System.out.println("obj1.equals(obj2) : 같음");
	else
		System.out.println("obj1.equals(obj2) : 다름");
	}

}
