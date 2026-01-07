class box{
	box()
	{
		System.out.println("No Dimensions");
	}
	box(int length)
	{
		System.out.println("Length: "+length);
	}
	box(int length, int breadth)
	{
		System.out.println("Area: "+length*breadth);
	}
	box(int length, int breadth, int height)
	{
		System.out.println("Volume: "+length*breadth*height);
	}
}
class volcalc{
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			box b1= new box();
		}
		else if(args.length==1)
		{
			int length=Integer.parseInt(args[0]);
			box b2= new box(length);
		}
		else if(args.length==2)
		{
			int length=Integer.parseInt(args[0]);
			int breadth=Integer.parseInt(args[1]);
			box b3= new box(length,breadth);
		}
		else if(args.length==3)
		{
			int length=Integer.parseInt(args[0]);
			int breadth=Integer.parseInt(args[1]);
			int height=Integer.parseInt(args[2]);
			box b4= new box(length,breadth,height);
		}
		else
		{
			System.out.println("Only 3 Dimensions must be passed!");
		}
	}
}