package class2;

import java.util.Scanner;

public class Test1 
{
	public static void main(String[] args) 
	{
		int option;
		double num1, num2, result; 
		Scanner captor = new Scanner(System.in);
		
		Calculator  calculator = new Calculator();
		
		do
		{
			System.out.println("XXXXXXXXXX   MAIN MANU   XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 1) Add        XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 2) Subtract   XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 3) Multiply   XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 4) Divide     XXXXXXXXXX");
			System.out.println("XXXXXXXXXX 5) Exit       XXXXXXXXXX");
			option = captor.nextInt();
			
			switch (option) {
			case 1:
				System.out.print("Please enter the first addend: ");
				num1 = captor.nextDouble();
				System.out.print("Please enter the second adding: ");
				num2 = captor.nextDouble();
				result = calculator.add(num1, num2);
				System.out.println("The result of the operation is: " + result);
				break;
				
			case 2:
				System.out.print("Please enter the minuend: ");
				num1 = captor.nextDouble();
				System.out.print("Please enter the subtrahend: ");
				num2 = captor.nextDouble();
				result = calculator.subtract(num1, num2);
				System.out.println("The result of the operation is: " + result);
				break;
			
			case 3:
				System.out.print("Please enter the multiplying: ");
				num1 = captor.nextDouble();
				System.out.print("Please enter the multiplier: ");
				num2 = captor.nextDouble();
				result = calculator.multiply(num1, num2);
				System.out.println("The result of the operation is: " + result);
				break;
				
			case 4:
				System.out.print("Please enter the dividend: ");
				num1 = captor.nextDouble();
				System.out.print("Please enter the divisor: ");
				num2 = captor.nextDouble();
				if(num2 == 0) 
				{
					System.out.println("Division by zero cannot be performed");
				}
				else
				{
					result = calculator.divide(num1, num2);
					System.out.println("The result of the operation is: " + result);
				}
				break;
			case 5:
				System.out.println("Thanks for using our calculator");
				break;
			default:
				System.out.println("You entered an incorrect option");
				break;
			}
			
			
		} while( option != 5 );
	}

}
