package ex09_object;

public class Saram6 {

	String name;
	double w;
	double ki;
	int age;

	Saram6(String name,double w,double ki,int age) {
		this.name = name;
		this.w = w;
		this.ki = ki;
		this.age = age;
		

	}
	

	public void eat() {
		System.out.println(name + "이(가)밥을 먹는다.");
	}

	public void walk() {
		System.out.println(name + "이(가) 걷기전 몸무게는 "+ w + "입니다 .");
	}

	public void sesu() {
		System.out.println(name + "이(가)세수한다.");
	}
}