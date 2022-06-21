package org.bank;

public enum TypeAccount {
	SAVING,CURRENT,FD,LOAN,DMAT;
	@Override
	public String toString()
	{
		return "A/c type :"+ name().toLowerCase();
		
	}
}
