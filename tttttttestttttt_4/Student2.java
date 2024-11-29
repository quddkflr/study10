package tttttttestttttt_4;

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

	static void sort(Student2[] students) {

		for (int a = 0; a < students.length; a++) {

			for (int b = 0; b < students.length - a - 1; b++) {

				if (students[b].getTotal() < students[b + 1].getTotal()) {

					Student2 temp = students[b];

					students[b] = students[b + 1];

					students[b + 1] = temp;

				}

			}

		}

	}

	public String toString() {

		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + getTotal() + "\t" + getAverage();

	}

}



