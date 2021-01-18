package class1;

import java.util.Scanner;

public class Test 
{

	public static void main( String[] args ) 
	{
		int option; 
		Scanner captor = new Scanner( System.in );
		
		System.out.println( "This program calculates the area of ​​the following figures: " );
		System.out.println( "1) Square" );
		System.out.println( "2) Rectangle" );
		System.out.println( "3) Triangulo" );
		System.out.println( "4) Circle" );
		System.out.print( "Please enter the option of the figure to which you want to calculate your area: " );
		
		option = captor.nextInt();
		
		switch( option )
		{
			case 1:
				Square square = new Square(); 
				System.out.print( "Please enter the size of the square: " );
				square.size = captor.nextDouble();
				System.out.println( "The area of ​​the square is: " + square.area() );
				break;
				
			case 2:
				Rectangle rectangle = new Rectangle(); 
				System.out.print( "Please enter the base of the rectangle: " );
				rectangle.base = captor.nextDouble();
				System.out.print( "Please enter the height of the rectangle: " );
				rectangle.height = captor.nextDouble();
				System.out.println( "The area of ​​the rectangle is: " + rectangle.area() );
				break; 
		
			case 3: 
				Triangle triangle = new Triangle(); 
				System.out.print("Please enter the base of the triangle: ");
				triangle.base = captor.nextDouble(); 
				System.out.print( "Please enter the height of the triangle: " );
				triangle.height = captor.nextDouble();
				System.out.println( "The area of ​​the triangle is: " + triangle.area() );
				break;
				
			case 4:
				Circle circle = new Circle();
				System.out.print("Please enter the radio of the circle: ");
				circle.radio = captor.nextDouble(); 
				System.out.println( "The area of ​​the circle is: " + circle.area() );
				break;
			
			default: 
				System.out.println("Ingresaste una opción incorrecta");
				break;
		}
		
	}

}
