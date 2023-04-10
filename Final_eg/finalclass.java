//final keyword-provide restriction
//final variable--cannot chage the value fo final variable

package Final_eg;

final class finalclass 
{
	void show()
	{
		System.out.println("Final class method");
	}
	
	//can't extend final class
	/* class test extends finalclass
	 * {
	 * void show()
	 * {
	 * System.out.println("Child class override method");
	 * }
	 * }
	 */
	
	public static void main(String args[])
	{
		finalclass fc =new finalclass();
		fc.show();
	}

}
