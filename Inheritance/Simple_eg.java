package Inheritance;

class Parents_eg
{
	int marks=80;
}

public class Simple_eg extends Parents_eg
{
	int additional_percentage=5;
	public static void main(String args[])
	{
		Simple_eg s=new Simple_eg();
		System.out.println("Total marks "+(s.marks+s.additional_percentage));
	}
}
