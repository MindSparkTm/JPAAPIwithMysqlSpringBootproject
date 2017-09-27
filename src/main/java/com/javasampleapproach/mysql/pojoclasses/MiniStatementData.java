package com.javasampleapproach.mysql.pojoclasses;

import java.util.List;

public class MiniStatementData {
	private String balance;
	private String transaction_summary;
	private String date;
	private List<String>balance2;
	private List<String>transactionsummary;
	private List<String>date2;
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAccount_summary() {
		return transaction_summary;
	}
	public void setAccount_summary(String transaction_summary) {
		this.transaction_summary = transaction_summary;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public MiniStatementData(String balance,String transaction_summary,String date) {
		this.balance = balance;
		this.transaction_summary = transaction_summary;
		this.date = date;
	}
	public MiniStatementData(List<String> balance2, List<String> transactionsummary, List<String> date2) {
		// TODO Auto-generated constructor stub
		this.balance2 = balance2;
		this.transactionsummary=transactionsummary;
		this.date2=date2;
	}
	@Override
	public String toString() {
		return "MiniStatementData [balance2=" + balance2 + ", transactionsummary=" + transactionsummary + ", date2="
				+ date2 + "]";
	}
	public String getTransaction_summary() {
		return transaction_summary;
	}
	public void setTransaction_summary(String transaction_summary) {
		this.transaction_summary = transaction_summary;
	}
	public List<String> getBalance2() {
		return balance2;
	}
	public void setBalance2(List<String> balance2) {
		this.balance2 = balance2;
	}
	public List<String> getTransactionsummary() {
		return transactionsummary;
	}
	public void setTransactionsummary(List<String> transactionsummary) {
		this.transactionsummary = transactionsummary;
	}
	public List<String> getDate2() {
		return date2;
	}
	public void setDate2(List<String> date2) {
		this.date2 = date2;
	}

}
