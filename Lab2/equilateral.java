class equilateral{
	public static void main(String[] args)
	{
		int count=0;
		int size=Integer.parseInt(args[0]);

		//Normal Triangle (Right-Angled)
		/*
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
		*/

		//Chrismas Tree
		/*
		for(int i=0;i<size;i++)
		{
			for(int j=size-i-1;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i*2;j++)
			{
				if(count%2==0)
				{
					System.out.print("*");
				}
				else System.out.print("#");
				count++;
			}
			System.out.print("\n");
		}
		for(int i=0;i<(size/2)-1;i++)
		{
			for(int j=0;j<size-2;j++)
			{
				if(j==0&&i==0)
				{
					System.out.print("$");
				}
				else System.out.print(" ");
			}
			System.out.print("|||");
			for(int j=0;j<size-2;j++)
			{
				if(j==size-3&&i==0)
				{
					System.out.print("$");
				}
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		*/

		//Equilateral Triangle
		for(int i=0;i<size;i++)
		{
			count++;
			for(int j=0;j<size+i;j++)
			{
				if(j<size-i-1)
				{
					System.out.print(" ");
				}
				else 
				{
					if((j+count)%2==0)
					{
						System.out.print(" ");
					}
					else System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}