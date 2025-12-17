class demo{
	String roll;
	String name;
	String branch;
	String section;
	demo(String rollin, String namein, String branchin, String sectionin)
	{
		roll=rollin;
		branch=branchin;
		name=namein;
		section=sectionin;

	}
	void display()
	{
		System.out.println("Roll No: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Branch: "+branch);
		System.out.println("Section: "+section);
	}
}
class useclass{
	public static void main(String[] args)
	{
		demo d1= new demo(args[0], args[1], args[2], args[3]);
		d1.display();
	}
}