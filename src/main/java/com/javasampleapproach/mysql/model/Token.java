package com.javasampleapproach.mysql.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "token")
public class Token implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "mobile_number")
	private String mobile_number;
     
	@Column(name = "account_number")
	private String account_number;
     
	@Column(name = "access_token")
	private String access_token;

	@Column(name = "telegram_id")
	private String telegram_id;
	
	@Column(name = "Allowed")
	private String Allowed;
	
	@Column(name = "date")
	private String date;
	public Token() {
	}

	public Token(String mobilenumber,String access_token,String telegram_id,String Allowed,String date,String account_number) {
		this.mobile_number = mobilenumber;
		this.access_token = access_token;
		this.telegram_id = telegram_id;
		this.Allowed = Allowed;
		this.date = date;
		this.account_number=account_number;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getTelegram_id() {
		return telegram_id;
	}
	public String getaccount_number() {
		return account_number;
	}

	public void setTelegram_id(String telegram_id) {
		this.telegram_id = telegram_id;
	}

	public String getAllowed() {
		return Allowed;
	}

	public void setAllowed(String allowed) {
		Allowed = allowed;
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
		return String.format("Token[id=%d, mobilenumber='%s', access_token='%s,allowed='%s']", id, mobile_number,access_token,Allowed);
	}

}
