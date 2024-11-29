package ex11_Exception;

public class Account_main {	
		public static void main(String args[]) {
			Account2 obj = new Account2("777-777-77777","최대박",10);
			try {
				int amount = obj.withdraw(1000000);
				System.out.println("인출액:" + amount);
			} catch (Exception e) {
				String msg = e.getMessage();
				System.out.println(msg);
			}
		}
	}


