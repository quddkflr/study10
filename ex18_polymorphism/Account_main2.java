package ex18_polymorphism;

public class Account_main2 {
	public static void main(String args[]) {
		CheckingAccount obj1 = new CheckingAccount("444-55-666666","홍길동",20000,"5555-566-666236");
		
		System.out.println("계좌번호:" + obj1.accountNo);
		System.out.println("예금주 이름:" + obj1.ownerName);
		System.out.println("잔액:" + obj1.balance);
		System.out.println();
	}

	 
}
       