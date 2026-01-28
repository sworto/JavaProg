interface operation{
	void deposit(float amount);
	void withdraw(float amount);
}
class Bank{
	int AadharNo;
	String Name;
	String Address;
	int ContactDet;
	void openAccount(int aadhar, String name, String address, int contact){
		AadharNo=aadhar;
		Name=name;
		Address=address;
		ContactDet=contact;
		System.out.println("Accout creation successful for: "+Name);
	}
	void closeAccount(){
		System.out.println("Account closed for: "+Name);
	}
}
class HDFC extends Bank{
	public void deposit(float amount){
		System.out.println("Added the amount: "+amount+" to the bank account.");
	}
	public void withdraw(float amount){
		System.out.println("Deducted the amount: "+amount+" from the bank account.");
	}
}
class BankSimulate{
	public static void main(String[] args){
		HDFC acc1= new HDFC();
		acc1.openAccount(1224,"Shivam Dubey","Bbsr",9034);
		acc1.deposit(112f);
		acc1.closeAccount();
	}
}
