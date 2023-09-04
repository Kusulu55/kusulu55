class Factorial
{
	public static void main(String[]args)
	{
		int start=1,end=10,fact=1;
		while(start<=end)
		{
		 fact=fact*start;
		 start++;
		}
		System.out.println(fact);
	}
}
