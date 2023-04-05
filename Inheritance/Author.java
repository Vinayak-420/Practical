package Inheritance;

public class Author 
{
	String name;
	int age;
	String Place;
	
	Author(String name,int age, String Place)
	{
		this.name=name;
		this.age=age;
		this.Place=Place;
		
	}
	
	void show() 
	{
	    	System.out.println("---------------------Author Details------------------------");
	    	System.out.println("Author Name:"+name);
	    	System.out.println(("Author Age:"+age));
	    	System.out.println("Author Place:"+Place);
	}

}
