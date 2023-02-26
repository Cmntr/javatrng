class else_example4
{
	public static void main(String[] args)
	{
		int i,j,k;
		i=100; j=79; k=209;
		int max;
		max=0;
		if(i>j && i>k) max=i;
		if(j>i && j>k) max=j;
		if(k>i && k>j) max=k;
      System.out.println("max of"+i+","+j+"and"+k+"is"+max);
	}
}