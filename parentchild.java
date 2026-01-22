class parent{
	void m1(){
		System.out.println("Nigga");
	}
}
class child extends parent{
	void m1(){
		System.out.println("NiggaCHild");
	}
	void m2(){
		System.out.println("ChildWontExecute");
	}
}
class parenchild{
	public static void main(String[] args){
		parent p1=new child();
		p1.m2();
	}
}