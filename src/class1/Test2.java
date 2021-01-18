package class1;

import java.util.Scanner;

public class Test2 
{

	public static void main(String[] args) 
	{
		int accountNumber, option;
		String ownerName; 
		double addMoney, extractMoney;
		Scanner captor = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();
		
		System.out.println("XXXXXXXXXX 	BANK ACCOUNT ADMIN XXXXXXXXXX");
		System.out.print( "XX Please enter your bank account number: " );
		accountNumber  = captor.nextInt();
		captor.nextLine();
		bankAccount.setAccountNumber(accountNumber);
		
		System.out.print("XX Please enter the name of the owner: ");
		ownerName = captor.nextLine(); 
		
		bankAccount.setOwnerName(ownerName);
		
		do
		{
			System.out.println("XXXXXXXXXX     MAIN MANU    XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 1) Add money     XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 2) Extract money XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 3) Exit          XXXXXXXXXX");
			option = captor.nextInt();
			
			if( option == 1 )
			{
				System.out.print("Enter the amount of money you want to add: ");
				addMoney = captor.nextDouble();
				bankAccount.addingMoney(addMoney);
				System.out.println("Your balance was successfully added, currently you have a balance of: " + bankAccount.getAmountOfMoney());
			}
				else if ( option == 2 )
			{
					System.out.println("You currently have a balance of: " + bankAccount.getAmountOfMoney());
					if (bankAccount.getAmountOfMoney() == 0) 
					{
						System.out.println("Currently you can not withdraw money from your account no longer has a balance");
						continue;
					}
					System.out.print("Enter the amount of money you wish to withdraw: ");
					extractMoney = captor.nextDouble();
					
					if( bankAccount.getAmountOfMoney() < extractMoney )
					{
						System.out.println("Your balance is insufficient to make this withdrawal");
					}
					else
					{
						bankAccount.extractMoney( extractMoney );
				System.out.println("His withdrawal was successful, he currently has a balance of: " + bankAccount.getAmountOfMoney());
					}
					
			}	else if ( option == 3 )
			{
				System.out.println("Thanks for using our program until later");
			}
				else
			{
				System.out.println("You entered an incorrect option");
			}
		} while( option != 3 );
		
		

	}

}
