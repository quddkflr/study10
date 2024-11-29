package ex23_instanceof;

public class Main2 {	
		public static void main(String args[]) {
			Account obj = 
					(Account)new CheckingAccount("111-22-3333333",
					"홍길동",100000,"5555-6666-7777-8888");	
			
			
			if (obj instanceof CheckingAccount) {
				pay((CheckingAccount) obj);
			}else {
				System.out.println("캐스트할 수 없는 타입입니다.");
			}
		}
		static void pay(CheckingAccount obj) {			
			try {
				int amount = obj.pay("5555-6666-7777-8888", 47000);
				System.out.println("인출액:" + amount);
				System.out.println("카드번호:" + obj.cardNo);
			}catch (Exception e) {
				System.out.println(e.getMessage());
								
			}
		}
	}


