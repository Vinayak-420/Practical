package Com.cognizant.tax;
public class TaxCalculator 
{
	public float basicSalary=125000;
	public float tax;
	public boolean citizenship=true;
	public int nettSalary;
	
	void calculateTax()
	{
		tax=30*basicSalary/100;
		System.out.println("The Tax of the employee for the "+basicSalary+ " is " + tax);
	}
	
	void deductTax()
	{
		nettSalary=(int) (basicSalary-tax);
		System.out.println("The nett salary of the employee "+nettSalary);
	}
	
	void validateSalary()
	{
		if(basicSalary>100000 && citizenship==true)
		{
			System.out.println("The salary and citizenship eligibility: True");
		}
		else
		{
			System.out.println("The salary and citizenship eligibility: False");
		}
	}
}
