package Method;
import java.util.Scanner;
public class User_defined2 
{
	public static void positive_negative(int number)
	{
		if (number>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
		
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int number=sc.nextInt();
	positive_negative(number);
}
}

