//exapmle of abstract class
package Abstract;

abstract class Testabstract //abstract class-parent classs
{
	abstract void display();//abstract method
}

class Demo1 extends Testabstract//1st child class 
{
	void display()//abstract method of parent class
	{
		System.out.println("Demo1 method invoked");
	}
}

class Demo2 extends Testabstract// 2nd child class
{
	void display()//abstract method of parent class
	{
		System.out.println("Demo2 method invoked");
	}
}


public class abstractmethod
{
	public static void main(String args[])
	{
		Demo1 child1=new Demo1();
		Demo2 child2=new Demo2();
		child1.display();
		child2.display();
	}
}
