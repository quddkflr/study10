package ex60_SharedArea_problem;

public class PrintThread extends Thread{
	private SharedArea sharedArea;
	
	PrintThread(SharedArea sharedArea){
		this.sharedArea = sharedArea;
	}
		public void run() {
			while(sharedArea.isReady() != true) {
				System.out.println("실행중 ~");

		}
		System.out.println("공유 영역의 데이터 = " + sharedArea.getResult());
		
	}

}