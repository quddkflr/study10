package ex62_syn_solution.copy;

public class PrintThread extends Thread {
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		for (int a=0; a<3;a++) {

		synchronized (sharedArea) {
			int balance1 = sharedArea.getAccount1().getBalance();
			int balance2 = sharedArea.getAccount2().getBalance();
			int sum = balance1 + balance2;
			System.out.println("계좌 잔액 합계: " + sum);
		}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
