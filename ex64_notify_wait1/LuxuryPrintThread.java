package ex64_notify_wait1;

public class LuxuryPrintThread extends Thread {
	private SharedArea sharedArea;

	LuxuryPrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;

	}

	public void run() {
		if (sharedArea.isReady() != true) {
			try {
				synchronized (sharedArea) {
					sharedArea.wait();

				}
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("*** π = " + sharedArea.getResult() + " ***");
	}

}
