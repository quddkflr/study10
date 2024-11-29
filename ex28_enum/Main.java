package ex28_enum;

import ex20_interface4.Lendable;
import ex20_interface4.SeparateVolume;

public class Main {
	public static void main(String args[]) {
		SeperateVolume obj = new SeperateVolume("863ㅂ", "나무", "베르베르");
		printState(obj);
		obj.checkOut("이수경", "20240124");
		printState(obj);

	}
	
	static void printState(SeperateVolume obj) {
		if (obj.state == BookState.STATE_NORMAL) {
			System.out.println("---------------");
			System.out.println("대출상태: " + BookState.STATE_NORMAL.value());
			System.out.println("---------------");
		}
		if (obj.state == BookState.STATE_BORROWED) {
		System.out.println("---------------");
	    System.out.println("대출상태: " + BookState.STATE_BORROWED.value());
		System.out.println("대출인:" + obj.borrower);
		System.out.println("대출일:" + obj.checkOutDate);
		System.out.println("---------------");
	}
}

}
