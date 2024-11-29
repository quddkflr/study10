package ex18_polymorphism;

public class Account_main {
	public static void main(String args[]) {
		Account obj = new Account("111-222-333333","임꺽정",0);
		
		System.out.println("계좌번호:" + obj.accountNo);
		System.out.println("예금주 이름:" + obj.ownerName);
		System.out.println("잔액:" + obj.balance);
		System.out.println();
	}
}
