package com.javasampleapproach.mysql.pojoclasses;

public class BalanceData {
	private String balance;
	private String auth;
	private String date;
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public BalanceData(String auth) {
		this.auth = auth;
	}
	
	public BalanceData(String balance,String date)
	{
		this.balance = balance;
		this.date=date;
		
	}
	
	
}
