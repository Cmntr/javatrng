  class Rectangle
{
private	double length;
private	double width;
public Rectangle()
	{
	length=width=0.0;
}
public Rectangle(double l,double w)
	{
	length=l;
	width=w;
	
	}
 public void area()
	{
	 System.out.println("area="+(length*width));
	}
}
public class Rectangle505
{
	public static void main(String[] args)
	{
		Rectangle rect1=new Rectangle();
		Rectangle rect2=new Rectangle(4,15);
		rect1.area();
		rect2.area();
	}
}
