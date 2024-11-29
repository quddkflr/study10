package ex20_interface2;

public class Main3 {
	public static void main(String args[]) {
		Lendable arr[] = new Lendable[3];
		
		arr[0] = new SeparateVolume("883ㅇ","푸코의 진자","에코");
		arr[1] = new SeparateVolume("609.2","서양미술사","곰브리치");
		arr[2] = new AppCDInfo("02-17","마이크로서비스를 위한 자바 프로그래밍","유시진");
		
		checkOutAll(arr, "홍길동","2023-05-17");
		
	}

	static void checkOutAll(Lendable[] arr, String borrower, String date) {
		for (Lendable a : arr) {
		     a.checkOut(borrower, date);
		
		
	}
	}
}
	
		
	
	
	


