class volume{
	volume(int height, int width, int length)
	{
		System.out.println("Volume: "+height*width*length);
	}
}
class boxcalc{
	public static void main(String[] args)
	{
		int length=Integer.parseInt(args[0]);
		int width=Integer.parseInt(args[1]);
		int height=Integer.parseInt(args[2]);
		volume box1=new volume(length,width,height);
	}
}