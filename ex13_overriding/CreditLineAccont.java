package ex13_overriding;

public class CreditLineAccont extends Account{
	int creditLine;
	
	CreditLineAccont(int creditLine,String accountNo,String ownerName,int balance){
		super(accountNo,ownerName,balance);		
		this.creditLine = creditLine;

}
	int withdraw(int amount) throws Exception{
		if (balance + creditLine< amount)				
		throw new Exception("인출이 불가능합니다.");
		balance -= amount;
		return amount;
}
}