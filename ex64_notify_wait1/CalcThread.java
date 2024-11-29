package ex64_notify_wait1;

public class CalcThread extends Thread {
	
	private SharedArea sharedArea;

	CalcThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;

	}

	public void run() {
		double total = 0.0;
		// 파이를 계산하는 부분
		for (int cnt = 1; cnt < 1000000000; cnt += 2)
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;

		sharedArea.setResult(total * 4);
		sharedArea.setReady(true);

		synchronized (sharedArea) {
			sharedArea.notifyAll();

		}
	}
}
