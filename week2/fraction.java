import java.util.Scanner;

public class Fraction
{
	public static void main(String[] args)
	{
		int numerator, denominator;
		Scanner scan = new Scanner(System.in);
		double fraction;

		System.out.println("Numerator: ");
		numerator = scan.nextInt();
		
		System.out.println("Denominator: ");
		denominator = scan.nextInt();
		
		fraction = (double) numerator/denominator;
		System.out.println("The output is " + fraction);
	
	}

}