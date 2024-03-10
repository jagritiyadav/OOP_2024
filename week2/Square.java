import java.util.Scanner;

public class Squares
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num1;
		
		System.out.println("Enter the side of square");
		num1 = scan.nextInt();
	
		System.out.println("The area of square is "+ num1*num1);
		System.out.println("The perimeter of square is " + 4*num1);

	
	}

}