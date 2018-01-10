
//bank account

import java.util.Scanner;

class account 
{
	private int accountNumber;
	private double balance;
	public enum Gend { MALE, FEMALE };
	private Gend gender;
	public account(double bal, Gend g)
	{
		lastAss++;
		accountNumber=lastAss;
		balance=bal;
		gender=g;
	}
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public void withdraw(double amount) throws Exception
	{
		if(amount<=balance)
			balance = balance - amount;
		else
			throw new IllegalArgumentException("Amount exceeds balance");
			//throw new NotWithdrawnException("Amount exceeds balance"); error
	}
	public double getBalance()
	{
		return balance;
	}
	public int getNumber()
	{
		return accountNumber;
	}
	public void taxDeduction()
	{
		double deduct = (taxRate * balance) / 100.0;
		balance = balance - deduct;	
	}
	public final double taxRate=0.5;
	private static int lastAss=126754;
}

public class BankAccount
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		account my;
		int n;
		double balance,amount;
		
		System.out.print("Please enter the opening balance:");
		balance = scan.nextDouble();

		System.out.print("Gender (M/F):");
		String input = scan.next();
		String status;
		if(input.equalsIgnoreCase("M"))
			my = new account(balance, account.Gend.MALE);
		else
			my = new account(balance, account.Gend.FEMALE);

		n = my.getNumber();
		balance = my.getBalance();
		System.out.print("Balance for account " +n);
		System.out.println(" is:" +balance);
		
		System.out.print("Enter amount to be deposited:");
		amount = scan.nextDouble();
		my.deposit(amount);
		balance = my.getBalance();
		System.out.println("Balance is " +balance);

		System.out.print("Enter amount to be withdrawn:");
		amount = scan.nextDouble();
		try
		{
		my.withdraw(amount);
		}
		catch(Exception e)
		{
		System.out.println("Not withdrawn...");
		}
		balance = my.getBalance();
		System.out.println("Balance is " +balance);

		my.taxDeduction();
		balance = my.getBalance();
		System.out.print("After tax deduction balance is:" + balance);
	}
}
