package class1;

public class BankAccount 
{
	private  String ownerName;
	private int accountNumber; 
	private double amountOfMoney = 0;
	
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(double amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}

	public void addingMoney( double money )
	{
		 this.amountOfMoney += money;
	}
	
	public void extractMoney( double money )
	{
		 this.amountOfMoney -= money; 
	}
}
