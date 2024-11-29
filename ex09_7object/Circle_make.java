package ex09_7object;

import ex09_1object.GoodsStock;
import ex09_1object.SubscriberInfo;

public class Circle_make {
	public static void main(String[] arms) {
		
		Circle a = new Circle(3.5);
		print(a);
		
		a.radius = 5.5;
		Circle_make.print(a);
	}
	public static void print(Circle a) {	
	
	System.out.println("원의 반지름 = " + a.radius);
	System.out.println("원의 넓이 = " + a.getArea());

}
}