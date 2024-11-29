package ex099_1object;

import ex09_4_private_field.Circle;

public class Student_main {

	public static void main(String[] arms) {
		
		Student[] students = { new Student("강호동", 85, 60, 70),
	               new Student("이승기", 90, 95, 80),
	               new Student("유재석", 75, 80, 100),
	               new Student("하하", 80, 70, 95),
	               new Student("이광수", 100, 65, 80) };
					
		
		Student.sort(students);
		print(students);
					
	}
	        	    				
	
	static void print(Student[] objs) {
		
		System.out.println("========== 학생별   /  과목별 총점구하기  ==========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		
		for (Student obj : objs) {
			printInfo(obj);
		}
		for (int j =0; j <45; j++){
			System.out.print("=");
		}
		System.out.print("\n총점\t"+Student.korTotal+"\t"+Student.mathTotal+"\t"+Student.engTotal);
		
	}
	
		
	

	public static void printInfo(Student obj) {

		System.out.println(obj.name + "\t" + obj.kor + "\t" + obj.math + "\t" + obj.eng + "\t"

				+ obj.getTotal() + "\t" + Math.round(obj.getAverage()));

	}	
	}

