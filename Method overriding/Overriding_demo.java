package Method_overriding;


class employee
{
	void incrementSalary()
	{
		System.out.println("The salary of employee will be incresed by 5%");
	}
}

class developer extends employee
{
	void incrementSalary()
	{
		System.out.println("The salary of developer will be incresed by 7%");
	}
}

class manager extends employee 
{
	void incrementSalary()
	{
		System.out.println("The salary of manager will be incresed by 10%");
	}
}

public class Overriding_demo
{
public static void main(String args[])
{

	manager m=new manager();
	m.incrementSalary();
	developer d=new developer();
	d.incrementSalary();
	employee e=new employee();
	e.incrementSalary();
}
}


