import java.util.*;
public class Task
{
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number:");
         int num1=scanner.nextInt();
        System.out.println("Enter the second number:");
		int num2=scanner.nextInt();
			int product=num1*num2;
			System.out.println(num1*num2+"is mul of two numbers");
			System.out.println(num1-num2+"is sub of two numbers");
			int smallest=Math.min(num1,num2);
			System.out.println("The smallest number is"+num1+"and"+num2+"is"+smallest);
			int largest=Math.max(num1,num2);
			System.out.println("The largest number is"+num1+"and"+num2+"is"+largest);


		}
}	