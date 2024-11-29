package ex59_SharedArea_problem;

public class MultithreadExample {
	public static void main(String args[]) {
		SharedArea obj = new SharedArea();
		
		CalcThread thread1 = new CalcThread(obj);
		PrintThread thread2 = new PrintThread(obj);
		
		thread1.start();
		thread2.start();
	}

}
