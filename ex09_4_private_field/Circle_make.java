package ex09_4_private_field;

public class Circle_make {
	public static void main(String args[]) {
	Circle a = new Circle(3.5);
	double asd = a.getArea();
	System.out.println("원의 반지름 = " + a.getRadius());
	System.out.println("원의 넓이 = " + asd);
	
	a.setRadius(10.5);
	asd = a.getArea();
	System.out.println("원의 반지름 = " + a.getRadius());
	System.out.println("원의 넓이 = " + asd);
}


}
