package ex09_3object;

import java.io.InputStream;
import java.util.Scanner;

import ex09_1object.GoodsStock;
import ex09_1object.SubscriberInfo;

public class Circle_make {
	public static void main(String[] arms) {

		Scanner sc = new Scanner(System.in);

		System.out.println("반지름을 입력하세요>");
		double num = sc.nextDouble();

		Circle a = new Circle(num);
		print(a);

	}

	public static void print(Circle a) {

		System.out.println("원의 반지름 = " + a.radius);
		System.out.println("원의 넓이 = " + a.getArea());

	}
}