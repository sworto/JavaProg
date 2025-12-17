class methodselect{
	void method1(){
		System.out.println("This object 1 calls the first method");
	}
	void method2(){
		System.out.println("This object 2 calls the second method");
	}
}
class testclass{
	public static void main(String[] args)
	{
		methodselect obj1 = new methodselect();
		methodselect obj2 = new methodselect();
		obj1.method1();
		obj2.method2();
	}
}