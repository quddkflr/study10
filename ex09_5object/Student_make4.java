package ex09_5object;

import ex09_4_private_field.Circle;

public class Student_make4 {

	public static void main(String[] arms) {

		//Student h1 = new Student("강호동", 85, 60, 70);
		//Student h2 = new Student("이승기", 90, 95, 80);
		//Student h3 = new Student("유재석", 75, 80, 100);
		//Student h4 = new Student("하하", 80, 70, 95);
		//h5 = new Student("이광수", 100, 65, 80);
		
		Student[] students = { new Student("강호동", 85, 60, 70),
	               new Student("이승기", 90, 95, 80),
	               new Student("유재석", 75, 80, 100),
	               new Student("하하", 80, 70, 95),
	               new Student("이광수", 100, 65, 80) };
		

		int subject[] = getTotal(students);
		print(students, subject);
		
	}

	private static int[] getTotal(Student[] objs) {
		int[] subject = new int[3];
		for (Student obj : objs) {
		subject[0] +=  obj.kor;
		subject[1] +=  obj.eng;
		subject[2] +=  obj.math;
	}
		return subject;

	}
	static void print(Student[] objs,int[] subject) {
		
		System.out.println("========== 학생별   /  과목별 총점구하기  ==========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		
		for (Student obj : objs) {
			printInfo(obj);
		}
		for (int j =0; j <45; j++){
			System.out.print("=");
		}
		System.out.print("\n총점\t");
		for(int i = 0; i < subject.length; i++)
			System.out.print(subject[i] + "\t");
	}
	
		
	

	public static void printInfo(Student obj) {

		System.out.println(obj.name + "\t" + obj.kor + "\t" + obj.math + "\t" + obj.eng + "\t"

				+ obj.getTotal() + "\t" + Math.round(obj.getAverage()));

	}
	
}
