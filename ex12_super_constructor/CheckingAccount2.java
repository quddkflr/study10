package ex12_super_constructor;

class CheckingAccount2 extends Account{
	String cardNo;
	
	CheckingAccount2(String accountNo,String ownerName,int balance,String cardNo){
		super(accountNo,ownerName,balance);		
		this.cardNo = cardNo;
	}
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.endsWith(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		
		return super.withdraw(amount);
	}
}
