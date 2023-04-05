package Inheritance;

public class Aggregation_Eg 
{
	public static void main(String args[])
	{
		Address a=new Address("Solapur","Solapur","India");
		Student s=new Student(01,"Vnk",a);
		s.show();
		
	}

}
