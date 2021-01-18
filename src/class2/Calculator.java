package class2;

public class Calculator 
{
	private double result; 

	public double add(double num1, double num2)
	{
		this.result = num1 + num2; 
		return this.result;
	}
	
	public double subtract(double num1, double num2)
	{
		this.result = num1 - num2; 
		return this.result;
	}
	
	public double multiply(double num1, double num2)
	{
		this.result = num1 * num2; 
		return this.result;
	}
	
	public double divide(double num1, double num2)
	{
		this.result = num1 / num2; 
		return this.result;
	}
	
}
