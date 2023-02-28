class TestOuter
{
	static int data=30;
	static class Inner
	{
		void msg()
		{
			System.out.println("data is"+data);
		}//msg()
	}//Inner
	public static void main(String[]args)
	{
		TestOuter.Inner Obj=new TestOuter.Inner();
		Obj.msg();
	}//main()
}//TestOuter