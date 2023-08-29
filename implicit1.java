class 	Impliciti
{
	public static void main(String[]args)
	{
		byte ba=12;
		System.out.println("ba $ "+ba);
		int  in=ba;
		System.out.println("in $ "+in);
		double d=(ba);
		System.out.println("d $ "+d);
		float f=ba;
		System.out.println("f $ "+f);
	}
}