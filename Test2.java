class MyDate
{
	private int day;
	private int month;
	private int year;
	public int get_day()
	{
		return day;

	}//get_day()
	public void set_day(int d)
	{
		day=d;
	}//set_day()
	public int get_month()
{
		return month;

	}//get_month()
	public void set_month(int m)
	{
		month=m;
	}//set_month()
	public int get_year()
{
		return year;

	}//get_year()
	public void set_year(int y)
	{
		year=y;
	}//set_year()
}//Mydate
class Test2
{
	public static void main(String[]args)
	{
		MyDate ob1=new MyDate();
		//ob1.day=10;
		ob1.set_day(10);
		ob1.set_month(2);
		ob1.set_year(2023);
		//10-2-2023;
		System.out.println(ob1.get_day()+"-"+ob1.get_month()+"-"+ob1.get_year());
	}
}
