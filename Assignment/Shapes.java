package Asssignment;

public class Shapes
{
	int numberOfSides;
	void CalculateShapeArea(int numberOfSides,int sidelength)
	{
		if(numberOfSides==1)
		{
			Circle cir=new Circle();
			cir.radius=sidelength;
			cir.calculateArea();
			
		}
		else if(numberOfSides==3)
		{
			Triangle t=new Triangle();
			t.sides=sidelength;
			t.calculateArea();
		}
		else if(numberOfSides==4)
		{
			Square s=new Square();
			s.sides=sidelength;
			s.calculateArea();
			
		}
		else
		{
			System.out.println("No Shapes Present");
		}	
	}
	
	public static void main(String args[])
	{
		Shapes s=new Shapes();
		s.CalculateShapeArea(3, 12);
		s.CalculateShapeArea(4, 15);
		s.CalculateShapeArea(5, 15);
		
	}
	

}
