package ex09_object;

public class Saram3 {

	String name;
	double w;
	double ki;
	int age;

	Saram3(String name2) {
		name = name2;
		

	}

	public void eat() {
		System.out.println(name + "이(가)밥을 먹는다.");
	}

	public void walk() {
		System.out.println(name + "이(가)걷는다.");
	}

	public void sesu() {
		System.out.println(name + "이(가)세수한다.");
	}
}