import java.util.Scanner;
public class Program307b
{
 static double perimeter_of_a_circle(double radius)
	{
	 return 2*Math.PI*radius;
	}
	public static void main(String[]args)
	{
		double radius;
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the radius of the circle:");
		radius=sc.nextInt();
		System.out.println("Perimer of the circle:"+perimeter_of_a_circle(radius));
	}
}