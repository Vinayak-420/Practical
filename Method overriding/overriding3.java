package Method_overriding;

class Father
{
	void batsman()
	{
		System.out.println("I am the father! I am a right-handed batsman!");
	}
}

class child extends Father
{
	void batsman()
	{
		System.out.println("I am the son! I am a left-handed batsman!");
	}
}

public class overriding3 
{
public static void main(String args[])
{
	Father f = new Father();
	f.batsman();
	
	Father fc=new child();
	fc.batsman();//this is the dynamic method dispatch
	//The compiler decides method call at runtime
}
}
