package Inheritance;

class Employee 
{
 long employeeid;
 String employeename;
 String employeeaddress;
 long employeephone;
 double basicSalary;
 double specialAllowance=250.80;
 double Hra=1000.50;
 double transportAllowance;
 
 Employee(long id,String name,String address,long phone)
 {
	 this.employeeid=id;
	 this.employeename=name;
	 this.employeeaddress=address;
	 this.employeephone=phone;	 
 }
 
 double calculateSalary()
 {
	
	double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100); 
	return salary;
 }
 
 double calculateTransportAllowance()       
	{
		
		transportAllowance = 10.0/100.0*basicSalary;
		return transportAllowance;
		
	}
}

class Manager extends Employee
{
	Manager(long id,String name,String address,long phone,double salary)
	{
		super(id,name,address,phone);
		this.basicSalary=salary;
	}
	
	double calculateTransportAllowance() 
	{
		double transportAllowance = 15*basicSalary /100;
		return transportAllowance;
		
	}	
}

class trainee extends Employee
{
	trainee(long id,String name,String address,long phone,double salary)
	{
		super(id,name,address,phone);
		this.basicSalary=salary;
	}
}

public class InheritanceActivity
{
	public static void main(String[] args) 
	{
		Manager m = new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.println("Manager Salary is: "+m.calculateSalary());
		System.out.println("Manager Transport Allowance: "+m.calculateTransportAllowance());
		System.out.println("Updated Salary of Manager: "+((m.calculateSalary()+m.calculateTransportAllowance())));

		
		trainee t=new trainee(29846,"Jack","Mumbai India", 442085,45000);
		System.out.println("\nTrainee Salary is: "+t.calculateSalary());
		System.out.println("Trainee Transport Allowance: "+t.calculateTransportAllowance());
		System.out.println("Updated Salary of Trainee: "+((t.calculateSalary()+t.calculateTransportAllowance())));

	}
}

