package ex45_ArrayTest;

import java.util.ArrayList;

public class Student3 {
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

	public Student3(String name, int kor, int eng, int math) {

		this.name = name;

		this.kor = kor;

		this.eng = eng;

		this.math = math;

		korTotal += kor;

		engTotal += eng;

		mathTotal += math;

	}

	static void sort(ArrayList<Student3> as) {

		for (int a = 0; a < as.size(); a++) {
			
			int size = as.size();

			for (int b = 0; b < as.size() - a - 1; b++) {

				if (as.get(b).getTotal() < as.get(b + 1).getTotal()) {

					Student3 temp = as.get(a);
					as.set(a, as.get(b));
					as.set(b, temp);

				}

			}

		}

	}

	public String toString() {

		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + getTotal() + "\t" + getAverage();

	}

}
