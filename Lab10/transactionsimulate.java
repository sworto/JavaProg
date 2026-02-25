class bankAccount implements Runnable{
	int Funds=1000;
	synchronized public void run(){
		for(int i=0;i<5;i++){
			this.Withdraw();
		}
		for(int i=0;i<5;i++){
			this.Deposit();
		}
		System.out.println("All associated Transactions with: "+Thread.currentThread()+" completed.");
	}
	void Withdraw(){
		Funds=Funds-100;
		System.out.println("Funds After Withdrawal: "+Funds+" "+Thread.currentThread());
		return;
	}
	void Deposit(){
		Funds=Funds+100;
		System.out.println("Funds After Deposit: "+Funds+" "+Thread.currentThread());
		return;
	}
}
class transactionsimulate{
	public static void main(String[] args){
		bankAccount b1= new bankAccount();
		Thread t1= new Thread(b1);
		Thread t2= new Thread(b1);
		Thread t3= new Thread(b1);
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);
		t1.start();
		t2.start();
		t3.start();
		return;
	}
}