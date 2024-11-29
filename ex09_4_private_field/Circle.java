package ex09_4_private_field;

public class Circle {
	
	private double radius;
	
	final double PI = 3.14;

	Circle(double radius) {
		this.radius = radius;
	}
	double getArea() {
		return radius * radius * PI;
	}
	//getter 메서드
	public double getRadius() {
		return radius;
	}
	//setter 메서드
	public void setRadius(double radius) {
		this.radius = radius;
	}
}