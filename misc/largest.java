public class largest
{
	public static void main(String[] args)
	{
		int x=Integer.MIN_VALUE;
		for(String s:args)
		{
			if(Integer.parseInt(s)>x)
			{
				x=Integer.parseInt(s);
			}
		}
		System.out.println("The biggest Integer is: "+x);
	}
}