class tool{
	tool()
	{
		System.out.println("Provide atleast two arguments.");
	}
	tool(float x, float y)
	{
		System.out.println("Multiplication: "+x*y);
	}
	tool(float x, float y, float z)
	{
		System.out.println("Multiplication: "+x*y*z);
	}
}
class multiplication{
	public static void main(String[] args)
	{
		if(args.length<=1)
		{
			tool t1= new tool();
		}
		else if(args.length>1&&args.length<=3)
		{
			float x=Float.parseFloat(args[0]);
			float y=Float.parseFloat(args[1]);
			if(args.length==2)
			{
				tool t2= new tool(x,y);
			}
			else 
			{
				float z=Float.parseFloat(args[2]);
				tool t2= new tool(x,y,z);
			}
		}
		else
		{
			System.out.println("Too many arguments!");
		}
	}
}
