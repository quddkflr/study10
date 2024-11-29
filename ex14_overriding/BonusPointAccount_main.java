package ex14_overriding;

public class BonusPointAccount_main {
	public static void main(String args[]) {
		BonusPointAccount obj = new BonusPointAccount("333-333-333333","김미영",0,0);
		obj.deposit(1000);
		System.out.println("잔액:"+obj.balance);
		System.out.println("누적 포인트:"+obj.bonusPoint);
		
	}

}
