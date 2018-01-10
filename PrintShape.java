import java.util.Scanner;

class Shape
{
	private double x;
	private double y;

	public Shape()
	{
		x=0;
		y=0;
	}

	public void getcoord(double x,double y)
	{
		this.x = x;
		this.y = y;
	}

	public void showcoord()
	{
		System.out.print("\n The X-axis coordinate is : " + this.x + "\n");
		System.out.print("\n The Y-axis coordinate is : " + this.y + "\n");
	}
}

class Rect extends Shape
{
	private double length;
	private double breadth;

	public Rect(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void showcoord()
	{
		System.out.print("\n The Length of the rectangle is  : " + this.length + "\n");
		System.out.print("\n The Breadth of the rectangle is : " + this.breadth + "\n");
	}		
}

public class PrintShape
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);		

		System.out.print("\n Enter the length of rectangle  : ");
		double length=in.nextDouble();			
		System.out.print("\n Enter the breadth of rectangle : ");
		double breadth=in.nextDouble();

		Shape s = new Rect(length,breadth);

		s.showcoord();
	}
}
