package ex099_1object;

public class Student {
	String name;
	int kor, eng, math;
	
	static int korTotal;
	static int mathTotal;
	static int engTotal;
	

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		korTotal += kor;
		engTotal += eng;
		mathTotal += math;
		
	}

	int getTotal() {
		return kor + eng + math;

	}

	float getAverage() {
		return (getTotal() / 3f);

	}
	static void sort(Student[] students) {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = i + 1; j< students.length; j++) {
				if(students[i].getTotal()<students[j].getTotal()) {
					Student imsi =students[i];
					students[i] = students[j];
					students[j] = imsi;
				}
			}
		}								
	}
	

}
