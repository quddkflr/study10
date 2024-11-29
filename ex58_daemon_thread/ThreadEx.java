package ex58_daemon_thread;

public class ThreadEx {
	public static void main(String[] args) {
		Thread t = new Thread(new Threadautosave());
		t.setDaemon(true);
		
		t.start();
		
		for (int i = 1; i<= 30; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			
			if(i == 5)
				Threadautosave.autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
