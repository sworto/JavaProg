interface operation{
	 void deposit(int val);
	 void withdraw(int val);
}
abstract class bank{
	abstract void openAccount(int acno, String name);
	abstract void closeAccount(int acno);
}
class HDFC extends bank implements operation{
	int acno;
	String name;
	int balance;
	public void deposit(int val){
		acno=val+acno;
	}
	public void withdraw(int val){
		acno=acno-val;
	}
	void openAccount(int acno, String name){
		this.acno=acno;
		this.name=name;
		System.out.println("Accoutn Opened");
	}
	void closeAccount(int acno){
		System.out.println("Accoutn CLose");
	}
}
class banksim{
	public static void main(String[] args){
		HDFC h1= new HDFC();
		h1.acno=10002;
		h1.name="Shivam";
		h1.balance=1000;
		h1.openAccount(10002,"Shivam");
	}
}