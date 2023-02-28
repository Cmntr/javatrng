class TestOuter605
{
	static int data=30;
	static class Inner
	{
		static void msg()
		{
			System.out.println("data is"+data);
		}//msg()
	}//Inner
	public static void main(String[]args)
	{
		TestOuter605.Inner.msg();
	}//main()
}//TestOuter