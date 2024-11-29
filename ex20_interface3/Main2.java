package ex20_interface3;

public class Main2 {
	public static void main(String args[]) {
		Lendable arr0 , arr1, arr2;
		
		arr0 = new SeparateVolume("883ㅇ","푸코의 진자","에코");
		arr1 = new SeparateVolume("609.2","서양미술사","곰브리치");
		arr2 = new AppCDInfo("02-17","마이크로서비스를 위한 자바 프로그래밍");
		
		checkOut(arr0, "홍길동","2024-01-09");
		checkOut(arr1, "홍길동","2024-01-09");
		checkOut(arr2, "홍길동","2024-01-09");
		
	}
	static void checkOut(Lendable arr, String borrower, String date) {
		arr.checkOut(borrower, date);
	}

}
