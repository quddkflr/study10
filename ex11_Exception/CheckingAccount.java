package ex11_Exception;

class CheckingAccount extends Account2{
	String cardNo;
	
	CheckingAccount() {
		super();
	}
	int pay(String cardNo, int amount)throws Exception{
		if(!cardNo.endsWith(this.cardNo) || (balance < amount))
			throw new Exception("지불이 불가능합니다.");
		
		return withdraw(amount);
	}
}
