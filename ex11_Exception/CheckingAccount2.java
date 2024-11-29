package ex11_Exception;

class CheckingAccount2 extends Account2{
	String cardNo;
	
	CheckingAccount2(String accountNo,String ownerName,int balance,String cardNo){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.cardNo = cardNo;
	}
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.endsWith(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		
		return withdraw(amount);
	}
}
