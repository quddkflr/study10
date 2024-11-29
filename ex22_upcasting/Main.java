package ex22_upcasting;

public class Main {	
		public static void main(String args[]) {
			Account obj = 
					new CheckingAccount("111-22-3333333",
					"홍길동",10,"5555-6666-7777-8888");											
						
			try {
				int amount = obj.pay("5555-6666-7777-8888", 47000);
				System.out.println("인출액:" + amount);
				System.out.println("카드번호:" + obj.cardNo);
			}catch (Exception e) {
				System.out.println(e.getMessage());
				
				
			}
		}
	}


