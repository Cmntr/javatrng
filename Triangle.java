import java.util.Scanner;
public class Triangle
{
 static double area_of_a_triangle(double base,double height)
	{
	 return 0.5*base*height;
	}
	public static void main(String[]args)
	{
		double base;double height;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the base and height of the triangle:");
		base=sc.nextDouble();
		height=sc.nextDouble();
		System.out.println("Area of triangle is"+area_of_a_triangle(base,height));
	}
}