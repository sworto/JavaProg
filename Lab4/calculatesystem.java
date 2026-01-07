class SavingsAccount{
	static float IntRate=10;
	int AccountNo=0;
	String Name;
	float Bal=0;
	static void ModifyIntrate(float x)
	{
		IntRate=x;
	}
	void CalculateIntrate(float time)
	{
		System.out.println("Total Interest: "+(Bal*(Intrate/100)*time));
	}
}
class calculatesystem{
	public static void main(String[] args)
	{
		SavingsAccount s1= new SavingsAccount();
		s1.AccountNo=1000234;
		s1.Bal=10034;
		s1.Name="Shivam Dubey";
		s1.CalculateIntrate(2);
		SavingsAccount.ModifyIntrate(4.5);
		s1.CalculateIntrate(2);
	}
}