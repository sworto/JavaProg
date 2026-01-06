class palindromic{
	public static void main(String[] args)
	{
		int size=args[0].length();
		for(int i=0;i<size/2;i++)
		{
			if(args[0].charAt(i)!=args[0].charAt(size-i-1))
			{
				System.out.println("Non Palindromic");
				return;
			}
		}
		System.out.println("Palindromic");
		return;
	}
}