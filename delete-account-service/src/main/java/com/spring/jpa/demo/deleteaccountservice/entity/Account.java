package com.spring.jpa.demo.deleteaccountservice.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Accounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private BigInteger Id;
	
	@Column(name="owner_name")
	private String ownerName;
	
	@Column(name="balance")
	private BigDecimal balance;
	
	public Account() {
		
	}
	
	public Account(String ownerName, BigDecimal balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public BigInteger getId() {
		return Id;
	}

	public void setId(BigInteger id) {
		Id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [Id=" + Id + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}

}