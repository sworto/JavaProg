class child implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Child Thread: "+"  "+Thread.currentThread()+" "+i);
		}
	}
}
class childtomain{
	public static void main(String[] args){
		child c1= new child();
		Thread t1= new Thread(c1);
		//Thread t2= new Thread(c1);
		t1.start();
		//t2.start();
		for(int i=0;i<20;i++){
			System.out.println("Parent Thread: "+"  "+Thread.currentThread()+" "+i);
		}
		return;
	}
}