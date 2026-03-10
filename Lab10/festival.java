class wish extends Thread{
	String currentmessage;
	wish(String s1){
		currentmessage= new String(s1);
	}
	public void run(){
		System.out.println(currentmessage+": From Thread: "+Thread.currentThread());
		return;
	}
}
class festival{
	public static void main(String[] args) throws InterruptedException{
		wish s1= new wish("Happy Diwali");
		wish s2= new wish("Happy Dussehra");
		wish s3= new wish("Happy New Year");
		Thread t1= new Thread(s1);
		Thread t2= new Thread(s2);
		Thread t3= new Thread(s3);
		//Using Join method
		t1.start();
		t1.join();
		Thread.sleep(2000);
		t2.start();
		t2.join();
		Thread.sleep(2000);
		t3.start();
		t3.join();
		//Using sleep method
		/*t1.start();
		Thread.sleep(2000);
		t2.start();
		Thread.sleep(2000);
		t3.start();*/
		return;
	}
}