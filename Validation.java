package org.validate;

import java.util.ArrayList;

import org.bank.TypeAccount;
import org.bank.BankAccount;
import org.exception.ExceptionHandling;

public class Validation {
	
	public static final double Min_Bal;
	
	static {
		Min_Bal=1000;
	}
	public static double validateBalance(double bal)throws ExceptionHandling
	{
		if(bal<Min_Bal)
			throw new ExceptionHandling("Insufficent Bal....");
		return bal;
	}
	
	public static TypeAccount parseAccountType(String acctType)
	{
		return TypeAccount.valueOf(acctType);
	}
	public static BankAccount validateAccountNo(int acctNo,ArrayList<BankAccount>accts)throws ExceptionHandling
	{
		for(BankAccount b:accts)
		{
			if(b!=null && b.getAcctNo()==acctNo)
				return b;
		}
		throw new ExceptionHandling("Accout no Invalid....");
	}

}
