class StaticMethod
{
	static void myStaticMethod()
	{
		System.out.println("static methods can be called without creating an object");
}
public void myPublicMethod()
	{
  System.out.println("static methods can be called by creating an object");
	}
	public static void main(String[]args)
	{
		myStaticMethod();
		StaticMethod myObj=new StaticMethod();
		myObj.myPublicMethod();

	}

}