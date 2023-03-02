import java.util.Scanner;
class MyDate
{
 private int day;
 private int month;
 private int year;
 public void set_day(int day)
	{
	 this.day=day;
	}
	private int getDay()
	{
       return day;
	}
	public void set_month(int month)
	{
	 this.month=month;
	}
	private int getMonth()
	{
       return month;
	}
	public void set_year(int year)
	{
	 this.year=year;
	}
	private int getyear()
	{
       return year;
	}

  public void displayDate()
	{
	  System.out.println("date" +getDay()+" "+getMonth()+" "+getyear());
	}
}
class Test
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		MyDate d1=new MyDate();
		System.out.println("Enter the Day:");
		d1.set_day(sc.nextInt());
		System.out.println("Enter the month:");
		d1.set_month(sc.nextInt());
		System.out.println("Enter the Year:");
		d1.set_year(sc.nextInt());
		d1.displayDate();

	}
}