import java.util.Scanner;
class thread1 extends Thread{
	int n;
	int m;
	//Constructor to initialise the start and end indexes
	thread1(){
		Scanner s1= new Scanner(System.in);
		System.out.print("Enter the first number: ");
		n=s1.nextInt();
		System.out.print("Enter the second number: ");
		m=s1.nextInt();
	}
	public void run(){
		for(int i=n;i<=m;i++){
			System.out.println(i);
		}
		return;
	}
}
class thread2 extends Thread{
	Scanner s1= new Scanner(System.in);
	String ipstring=null;
	//Constructor To initialise the name string
	thread2(){
		System.out.print("Enter the Name: ");
		ipstring= new String(s1.nextLine());
	}
	public void run(){
		for(int i=0;i<ipstring.length();i++){
			System.out.println(ipstring.charAt(i));
		}
		return;
	}

}
class twothreads{
	public static void main(String[] args) throws InterruptedException{

		//ThreadCreation
		thread1 t1= new thread1();
		thread2 t2= new thread2();
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		return;
	}
}