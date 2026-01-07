class obj{
	static int count=0;
	obj()
	{
		count++;
		System.out.println("Total objects made: "+count);
	}
}
class numobj{
	public static void main(String[] args)
	{
		obj o1= new obj();
		obj o2= new obj();
		obj o3= new obj();
		obj o4= new obj();

	}
}