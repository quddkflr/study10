package ex18_polymorphism;

public class CreditLineAccont extends Account{
	int creditLine;
	
	CreditLineAccont(String accountNo,String ownerName,int balance,int creditLine){
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