package org.main;

import static org.validate.Validation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.bank.BankAccount;

public class BankSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<BankAccount> accts = new ArrayList<>(1000);
			boolean exit = false;
			while (!exit) {
				System.out.println("Menu \n1.Insert A/c\n2.Deposit Money \n3.Withdraw Money"
						+ "\n4.Check the Balance \n5.List all the Customer Details \n"
						+ "6. Exit");
				System.out.println("Enter Your Choice :");
				
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter A/c Details : aactNo,custName,acctType,balance");
						
						BankAccount a = new BankAccount(sc.nextInt(), sc.next(), parseAccountType(sc.next()),
								validateBalance(sc.nextDouble()));
						
						
						accts.add(a);
						System.out.println("A/c created Sucessfully......");
						break;
					case 2:
						System.out.println("Enter Account no & amt to Deposit Money...");
					int acctNo=sc.nextInt();
					double amt=sc.nextDouble();
					BankAccount bankAccount=validateAccountNo(acctNo,accts);
					bankAccount.deposit(amt);
					System.out.println("Amount Deposit Sucessfully.....");
					
					
					
						break;
					case 3:
						System.out.println("Enter Account no & amt to withdraw Money..");
						acctNo=sc.nextInt();
						amt=sc.nextDouble();
						bankAccount=validateAccountNo(acctNo, accts);
						bankAccount.withdraw(amt);
						System.out.println("Amount Withdraw Successfully.....");
						break;
					case 4:
						System.out.println("Enter Acct no Check Balance...");
						acctNo=sc.nextInt();
						bankAccount=validateAccountNo(acctNo, accts);
						for(BankAccount a1:accts)
						{
							if(a1.getAcctNo()==acctNo)
							{	
								System.out.println(a1.getBalance());
							}
						}
						break;
					case 5:
						System.out.println("List All Customer Details : ");
						for(BankAccount a2:accts)
						{
							System.out.println(a2);
						}
						break;
					case 6:
						exit=true;
						System.out.println("Exit Sucessfully From Bank Application.......");
						break;
					}
					
				} catch (Exception e) {
					System.out.println("Error" + e);
				}
			}

		}

	}

}
