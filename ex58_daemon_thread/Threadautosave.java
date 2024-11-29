package ex58_daemon_thread;

import java.io.ObjectInput;

public class Threadautosave implements Runnable {
	static boolean autoSave = false;

	public void run() {
		while (true) {
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
