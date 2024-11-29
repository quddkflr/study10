package ex09_object;

public class Saram4 {

	String name;
	double w;
	double ki;
	int age;

	Saram4(String name2,double w2) {
		name = name2;
		w = w2;
		

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