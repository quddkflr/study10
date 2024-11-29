package ex18_polymorphism;

public class Account_main3 {
	public static void main(String args[]) {
		
    CreditLineAccont obj2 = new CreditLineAccont("12-125125-125","김선달", 30000,200000000);
    System.out.println("계좌번호:" + obj2.accountNo);
	System.out.println("예금주 이름:" + obj2.ownerName);
	System.out.println("잔액:" + obj2.balance);
	System.out.println();
	}
	}


