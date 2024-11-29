package ex42_clone;

import java.util.GregorianCalendar;

public class ObjectExample1 {
	public static void main(String args[]) {
		
		GregorianCalendar obj1 = new GregorianCalendar(2024,0,29);
		
		Object imsi = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar)imsi;
		
		System.out.printf("%tF %n",obj1);
		System.out.printf("%tF %n",obj2);
		
		obj1.set(2024,6,1);
		System.out.printf("%tF %n",obj1);
		System.out.printf("%tF %n",obj2);
	}

}
