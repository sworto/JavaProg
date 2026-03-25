abstract class register{
	int roll;
	String name;
	String discipline;
	int tenure;
	final int fee=200000;
	abstract void fees();
	void sdetails(int roll, String name, String discipline){
		this.roll=roll;
		this.name=name;
		this.discipline=discipline;
		System.out.println("Roll: "+this.roll);
		System.out.println("Name: "+this.name);
		System.out.println("Discipline: "+this.discipline);

	}
}
class BTech extends register{
	BTech(){
		tenure=4;
	}
	void fees(){
		System.out.println("Fees: "+(fee*tenure)+" INR");
	}
}
class MTech extends register{
	MTech(){
		tenure=2;
	}
	void fees(){
		System.out.println("Fees: "+(fee*tenure)+" INR");
	}
}
class registration{
	public static void main(String[] args){
		register b1= new BTech();
		register m1= new MTech();
		b1.sdetails(2405902,"Shivam Dubey","BTech CSE");
		b1.fees();
		System.out.println("");
		m1.sdetails(2405902,"Rachit Singh","MTech Mech");
		m1.fees();
		return;
	}
}