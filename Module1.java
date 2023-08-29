class Module1
{
	public static void main(String[] args)
	{
		int a=20,b=30,c=10;
		if(a<b)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		if(a<c)
		{
			a=a+c;
			c=a-c;
			a=a-c;
		}
		if(b<c)
		{
			b=b+c;
			c=b-c;
			b=b-c;
		}
			System.out.println("a="+ a+" "+ "b="+ b+" "+ "c="+ c);
		
}
}