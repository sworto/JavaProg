public class Sumble
{
	public static void main(String[] args)
	{
		int sum=0;
		for(String nums: args)
		{
			sum+=Integer.parseInt(nums);
		}
		System.out.println(sum);
	}
}