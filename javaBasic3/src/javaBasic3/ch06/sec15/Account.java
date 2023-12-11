package javaBasic3.ch06.sec15;

public class Account {
	
	String accountNum;
	String owner;
	int money;
	
	public Account(String accountNum, String owner, int money) {
		super();
		this.accountNum = accountNum;
		this.owner = owner;
		this.money = money;
	}

	public Account() {
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
