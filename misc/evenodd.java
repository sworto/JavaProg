public class evenodd
{
	public static void main(String[] args)
	{
		for(String s: args)
		{
			if(Integer.parseInt(s)%2==0)
			{
				System.out.println(s+" is even");
			}
			else
			{
				System.out.println(s+" is odd");
			}
		}
	}
}