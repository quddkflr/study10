package ex45_ArrayTest;

import java.util.ArrayList;

public class Student2 {
	private String name;

	private int kor, eng, math;

	public static int korTotal;

	public static int engTotal;

	public static int mathTotal;

	int getTotal() {

		return kor + eng + math;

	}

	float getAverage() {

		return Math.round(getTotal() / 3 * 10) / 10.0f;

	}

	public Student2(String name, int kor, int eng, int math) {

		this.name = name;

		this.kor = kor;

		this.eng = eng;

		this.math = math;

		korTotal += kor;

		engTotal += eng;

		mathTotal += math;

	}

	static void sort(ArrayList<Student2> as) {

		for (int a = 0; a < as.size(); a++) {

			for (int b = 0; b < as.size() - a - 1; b++) {
				
				Student2 num1 = as.get(b);
				Student2 num2 = as.get(b+1);
				
				if (as.get(b).getTotal() < as.get(b+1).getTotal()) {

					Student2 temp = num1;

					num1 = num2;

					num2 = temp;

				}

			}

		}

	}

	public String toString() {

		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + getTotal() + "\t" + getAverage();

	}

}
