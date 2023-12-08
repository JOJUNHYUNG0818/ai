package javaBasic3.ch06.sec07;

public class Account {
	private static int MIN_BALANCE=0;
	private static int MAX_BALANCE=1000000;
	
	private int money;
	
	public void setMoney(int money) {
		if(money>=MIN_BALANCE && money<=MAX_BALANCE)
		{
		this.money = money;
		}
	}

	public int getMoney() {
		return money;
	}

	

	
}
