interface operations{
	void earnings();
	void deductions();
	void bonus();
}
abstract class Manager implements operations{
	float basic=1000f;
	public void earnings(){
		System.out.println("Total Earnings: "+(basic+0.8*basic+0.15*basic));
	}
	public void deductions(){
		System.out.println("Deduction: "+basic*0.12);
	}
}
class Substaff extends Manager{
	public void bonus(){
		System.out.println("Bonus: "+basic*0.5);
	}
}
class SalaryManagement{
	public static void main(String[] args){
		Substaff s1= new Substaff();
		s1.earnings();
		s1.deductions();
		s1.bonus();
	}
}