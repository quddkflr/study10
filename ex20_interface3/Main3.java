package ex20_interface3;

public class Main3 {
	public static void main(String args[]) {
		SeparateVolume obj = new SeparateVolume("863ㅂ","나무", "베르베르");
		
		printState(obj);
		
		obj.checkOut("홍길동","2024-01-09");
		
		printState(obj);
		
	}

	static void printState(SeparateVolume obj) {
		if(obj.state == Lendable.STATE_NORMAL) {
			System.out.println("대출가능");
			}
		else if (obj.state == Lendable.STATE_BORROWED){
			System.out.println("대출중");
			System.out.println("대출인 :" + obj.borrower);
			System.out.println("대출일 :" + obj.checkOutDate);
		
	}
	}
	}

	
		
	
	
	


