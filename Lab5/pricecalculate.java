class sheet{
	sheet(){
	}
	sheet(int length, int breadth)
	{
		System.out.println("Cost associated: "+length*breadth*40);
	}
}
class box extends sheet{
	box(int l, int b, int height){
		System.out.println("Cost associated: "+l*b*height*60);
	}
}
class pricecalculate{
	public static void main(String[] args)
	{
		int size=args.length;
		if(size==2)
		{
			int l=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			sheet s1=new sheet(l,b);
		}
		else
		{
			int l=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int h=Integer.parseInt(args[2]);
			box b1=new box(l,b,h);
		}
	}
}
