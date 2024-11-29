package ex20_interface4;

public class Main3 {
	public static void main(String args[]) {
		SeparateVolume obj = new SeparateVolume("863ㅂ", "나무", "베르베르");

		printState(obj);

		try {
			obj.checkOut("수지", "2024-01-09");
			obj.checkOut("박보검", "2024-01-09");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		printState(obj);
	}

	static void printState(SeparateVolume obj) {
		if (obj.state == Lendable.STATE_NORMAL) {
			System.out.println("대출상태: 대출 가능!");
		} else if (obj.state == Lendable.STATE_BORROWED)
			System.out.println("대출상태: 대출중");
		    System.out.println("대출인:" + obj.borrower);
		    System.out.println("대출일:" + obj.checkOutDate);
	}
}
