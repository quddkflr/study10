package ex54_Thread_효율;

public class MulithreadExample1 {
	public static void main(String args[]) {
		Thread thread = new DigitThread();
		
		thread.start();
		
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);
		
		System.out.println("스레드 이름 : " + Thread.currentThread().getName());;
	}

}
