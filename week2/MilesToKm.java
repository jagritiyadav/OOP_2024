import java.util.Scanner;

public class MilesToKm
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double miles;
		
		miles = scan.nextFloat();
	
		System.out.println(miles + "miles = " + miles*1.61 + "km");
		
	
	}

}