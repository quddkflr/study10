package ex13_overriding;

public class Account_main3 {	
		public static void main(String args[]) {
			CreditLineAccont obj = new CreditLineAccont(20000,"5555-6666-7777-8888",
					"홍길동",100);											
					
			try {
				int amount = obj.withdraw(500);
				System.out.println("인출액:" + amount);
				System.out.println("잔액:" + obj.balance);
				System.out.println("마이너스 한도:" + obj.creditLine);
			}catch (Exception e) {
				String msg = e.getMessage();
				System.out.println(msg);
				
			}
		}
	}


