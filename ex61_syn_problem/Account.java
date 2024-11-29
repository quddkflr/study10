package ex61_syn_problem;

public class Account {
	private String accountNo;
	private String ownerName;
	private int balance;

	Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo =accountNo;

	}
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName =ownerName;

	}
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	int withdraw(int amount) {
		if (balance < amount)
			return 0;
		balance -= amount;
		return amount;
	}
}