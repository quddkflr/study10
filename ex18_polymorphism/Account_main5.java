package ex18_polymorphism;

public class Account_main5 {
	public static void main(String args[]) {
	Account obj = new Account("111-222-333333","임꺽정",0);
	printAccountInfo(obj);
	
	CheckingAccount obj1 = new CheckingAccount("444-55-666666","홍길동",20000,"5555-566-666236");
	printAccountInfo(obj1);
	
	CreditLineAccont obj2 = new CreditLineAccont("12-125125-125","김선달", 30000,200000000);
	printAccountInfo(obj2);
	
	BonusPointAccount obj3 = new BonusPointAccount("6212-23566-865","김미영", 0,0);
    printAccountInfo(obj3);
    
   
	}

	static void printAccountInfo(Account obj) {
		System.out.println("계좌번호:" + obj.accountNo);
		System.out.println("예금주 이름:" + obj.ownerName);
		System.out.println("잔액:" + obj.balance);
		System.out.println();
	                
		
	}
	}


