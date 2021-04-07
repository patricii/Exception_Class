package application;

import java.util.Locale;
import java.util.Scanner;

import models.bankExeption.BankExeptions;
import models.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.println("Enter account data:");
			System.out.print("Number: ");
			int accountnumber = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("WithDraw Limit: ");
			Double withdrawamount = sc.nextDouble();
			
			Account account = new Account(accountnumber, name, balance , withdrawamount);
			System.out.println("Would you like a Deposit? s/ n ");
			sc.nextLine();
			char deposit = sc.nextLine().charAt(0);
			if (deposit == 's') 
			{			
				System.out.print("Deposit value:");
				Double depositAmount = sc.nextDouble();
				account.Deposit(depositAmount);
			}
		
			System.out.print("Enter amount for withdraw:");
			Double withdraw = sc.nextDouble();
			account.WithDraw(withdraw);			
			System.out.print("New balance: " + account.getBalance());
					
		}
		catch(BankExeptions e)
		{
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e)
		{
			System.out.println("Sorry, Invalid operation!");
		}
		
		sc.close();

	}

}
