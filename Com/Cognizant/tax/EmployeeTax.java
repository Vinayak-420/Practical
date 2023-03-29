package Com.cognizant.tax;
public class EmployeeTax
{
	public static void main(String args[])
	{
		TaxCalculator tc=new TaxCalculator();
		tc.calculateTax();
		tc.deductTax();
		tc.validateSalary();
		
	}
}
