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
	public static void main(String[] args){
		wish s1= new wish("Happy Diwali");
		wish s2= new wish("Happy Dussehra");
		wish s3= new wish("Happy New Year");
		Thread t1= new Thread(s1);
		Thread t2= new Thread(s2);
		Thread t3= new Thread(s3);
		t1.start();
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){

		}
		t2.start();
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){

		}
		t3.start();
		return;
	}
}