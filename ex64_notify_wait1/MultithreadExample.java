package ex64_notify_wait1;

public class MultithreadExample {
	public static void main(String args[]) {
		
		SharedArea obj = new SharedArea();		
		CalcThread thread1 = new CalcThread(obj);
		PrintThread thread2 = new PrintThread(obj);
		SimplePrintThread thread3 = new SimplePrintThread(obj);
		LuxuryPrintThread thread4 = new LuxuryPrintThread(obj);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
