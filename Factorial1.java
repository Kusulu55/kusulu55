class Factorial1
{
	public static void main(String[]args)
	{
		int x=4,count=0;
		int initial=1;
		while(initial<=x)
		{
		if(x%initial!=0)
		{
			count++;
		}
			initial++;
		}
			System.out.println(count);
			System.out.println(initial);
	}
}