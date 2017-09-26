package com.javasampleapproach.mysql.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "balance")
public class Balance {
	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "account_number")
    private String account_number;
	
	@Column(name = "balance")
    private String balance;
	@Column(name = "date")
      private String date;
	
	
	public Balance(String account_number,String balance,String date) {
		this.account_number = account_number;
		this.balance = balance;
		this.date=date;
	

	}
	
	public Balance() {
		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Balance [id=" + id + ", account_number=" + account_number + ", balance=" + balance + ", date=" + date
				+ "]";
	}
	
	
	
	

}
