package com.javasampleapproach.mysql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "minisummary")
public class MiniStatement {
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "account_number")
    private String account_number;
	@Column(name = "transaction_summary")
    private String transaction_summary;
	@Column(name = "balance")
    private String balance;
	@Column(name = "date")
      private String date;
	@Override
	public String toString() {
		return "MiniStatement [account_number=" + account_number + ", transaction_summary=" + transaction_summary
				+ ", balance=" + balance + ", date=" + date + "]";
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getTransaction_summary() {
		return transaction_summary;
	}
	public void setTransaction_summary(String transaction_summary) {
		this.transaction_summary = transaction_summary;
	}
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
	
	public MiniStatement(String account_number,String transaction_summary,String balance,String date) {
		this.account_number = account_number;
		this.transaction_summary=transaction_summary;
		this.balance = balance;
		this.date=date;
	

	}
	
	public MiniStatement() {
		
		
	}
	
}
