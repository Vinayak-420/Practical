package Method;
import java.util.Scanner;
public class Average 
{
	public static void sum_average(int n1,int n2,int n3)
	{
		int sum=n1+n2+n3;
		float average=sum/3f;
		System.out.println("The sum of 3 numbers is:"+sum);
		System.out.println("The average of 3 numbers is:"+average);
		
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int n3=sc.nextInt();
	sum_average(n1,n2,n3);
	
}
}
