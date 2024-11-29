package ex09_5object;

import ex09_4_private_field.Circle;

public class Student_make {

	public static void main(String[] arms) {

		System.out.println("========== 학생별   /  과목별 총점구하기  ==========");

		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");

		Student[] students = { new Student("강호동", 85, 60, 70),
				               new Student("이승기", 90, 95, 80),
				               new Student("유재석", 75, 80, 100),
				               new Student("하하", 80, 70, 95),
				               new Student("이광수", 100, 65, 80) };

		int hapKor = 0, hapMath = 0, hapEng = 0;

		for (Student student : students) {

			print(student);

			hapKor += student.kor;

			hapMath += student.math;

			hapEng += student.eng;

		}

		System.out.println("=============================================");

		System.out.println("총점\t" + hapKor + "\t" + hapMath + "\t" + hapEng);

	}

	public static void print(Student student) {

		System.out.println(student.name + "\t" + student.kor + "\t" + student.math + "\t" + student.eng + "\t"

				+ student.getTotal() + "\t" + Math.round(student.getAverage()));

	}

}