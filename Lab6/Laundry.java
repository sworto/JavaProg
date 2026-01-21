interface Motor{
	float capacity=15.5f;
	void run();
	void consume(int amount);
}
class WashingMachine implements Motor{
	int loadsize;
	public void run(){ //the methods implemented from interface must be declared publicly
		loadsize=0;
		System.out.println("Emptied the drum, run complete.");
	}
	public void consume(int amount){
		loadsize=amount;
		System.out.println("Loaded the machine with "+amount+"Kilograms");
	}
}
class Laundry{
	public static void main(String[] args)
	{
		int loadsize=Integer.parseInt(args[0]);
		WashingMachine m1= new WashingMachine();
		m1.consume(loadsize);
		m1.run();
	}
}