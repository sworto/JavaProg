class human{
	void eat(){
		System.out.println("Humans eat food");
	}
	void speak(){
		System.out.println("Humans can speak languages.");
	}
}
class indian extends human{
	void eat(){
		System.out.println("Indians eat Paneer");
	}
	void speak(){
		System.out.println("Indians speak English and Hindi");
	}
}
class american extends human{
	void eat(){
		System.out.println("Americans eat hot-dogs");
	}
	void speak(){
		System.out.println("Americans speak English");
	}
}
class DynamicMethodTest{
	public static void main(String[] args){
		human h1=new human();
		h1.speak();
		h1.eat();
		h1= new indian(); //instatiation of h1 as indian
		h1.speak();
		h1.eat();
		h1= new american();  //instatiation of h1 as american
		h1.speak();
		h1.eat();
	}
}