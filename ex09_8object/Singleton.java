package ex09_8object;

public class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		System.out.println("여기는 getInstance");
		return s;
	}	
}
