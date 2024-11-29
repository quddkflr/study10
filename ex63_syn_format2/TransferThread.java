package ex63_syn_format2;

public class TransferThread extends Thread {
	private SharedArea sharedArea;

	TransferThread(SharedArea area) {
		this.sharedArea = area;
	}

	public void run() {
		for (int cnt = 0; cnt < 12; cnt++) {
			synchronized (sharedArea) {
				sharedArea.transfer();
			}
		}
	}
}
