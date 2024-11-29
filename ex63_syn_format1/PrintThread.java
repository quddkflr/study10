package ex63_syn_format1;

public class PrintThread extends Thread {
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		for (int a = 0; a < 3; a++) {

			int sum = sharedArea.getTotal();

			System.out.println("계좌 잔액 합계: " + sum);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
