package ex18_polymorphism;

public class Account_main4 {
	public static void main(String args[]) {
		
	BonusPointAccount obj3 = new BonusPointAccount("6212-23566-865","김미영", 0,0);
    System.out.println("계좌번호:" + obj3.accountNo);
	System.out.println("예금주 이름:" + obj3.ownerName);
	System.out.println("잔액:" + obj3.balance);
	System.out.println();
	}
	}


