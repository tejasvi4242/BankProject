package org.bank;
import static org.validate.Validation.*;

import org.exception.ExceptionHandling;
public class BankAccount {
	
	private int acctNo;
	private String custName;
	private TypeAccount acctType;
	private double balance;
	//private Date creationDate;
	public BankAccount(int acctNo, String custName, TypeAccount acctType, double balance) {
		super();
		this.acctNo = acctNo;
		this.custName = custName;
		this.acctType = acctType;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", custName=" + custName + ", acctType=" + acctType + ", balance="
				+ balance + "]";
	}

	
public int getAcctNo() {
		return acctNo;
	}
	//	B.l Method
	public void withdraw(double amt)throws ExceptionHandling
	{
		validateBalance(balance-amt);
		validateBalance(balance-amt);
		balance-=amt;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amt)
	{
		balance+=amt;
	}
	
	
	
}
