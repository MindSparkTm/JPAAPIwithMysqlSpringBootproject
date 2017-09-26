package com.javasampleapproach.mysql.pojoclasses;

public class ValidUser {
	private String isallowed;
	private String accountnumber;

	public String getIsallowed() {
		return isallowed;
	}

	
	public String getaccountnumber() {
		return accountnumber;
	}
	public ValidUser(String isallowed, String accountnumber) {
		this.isallowed = isallowed;
		this.accountnumber = accountnumber;
	}
	
	public ValidUser(String isallowed) {
		this.isallowed = isallowed;
	}
}
