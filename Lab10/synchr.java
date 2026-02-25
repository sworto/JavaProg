class obj extends Thread{
	synchronized public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Synchronised Thread: "+Thread.currentThread()+" Running");
		}
	}
}
class synchr{
	public static void main(String[] args){
		obj o1= new obj();
		Thread t1= new Thread(o1);
		Thread t2= new Thread(o1);
		Thread t3= new Thread(o1);
		t1.start();
		t2.start();
		t3.start();
		return;
	}
}
