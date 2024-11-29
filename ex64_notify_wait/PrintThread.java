package ex64_notify_wait;

public class PrintThread extends Thread{
	private SharedArea sharedArea;
	PrintThread(SharedArea sharedArea){
		this.sharedArea=sharedArea;
	}
	public void run() {
		if (sharedArea.isReady() != true) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait();
				}
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(sharedArea.getResult());
	}

}
