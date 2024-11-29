package ex09_3object;

public class Circle {
	double radius;
	
	final double PI = 3.14;

	Circle(double radius) {
		this.radius = radius;
	}
	double getArea() {
		return radius * radius * PI;
	}
}