class temp{
	void func1()
	{
		temp obj1= new temp();
		obj1.func2();
	}
	void func2()
	{
		System.out.println("Thank You");
	}
}
class crosscall{
	public static void main(String[] args)
	{
		temp newobj= new temp();
		newobj.func1();
	}
}