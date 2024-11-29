package ex61_syn_problem;

public class PrintThread extends Thread {
	private SharedArea sharedArea;

	PrintThread(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

	public void run() {
		// 필드의 계좌 account1과 account2의 잔액을 더한다.
		// "계좌 잔액 합계: " 를 출력한다.
		// Thread.sleep(1);
		// 위 세 과정을 3번 반복한다.
		for (int a = 0; a < 3; a++) {
			int balance1 = sharedArea.getAccount1().getBalance();
			int balance2 = sharedArea.getAccount2().getBalance();
			int sum = balance1 + balance2;
			System.out.println("계좌 잔액 합계: " + sum);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
