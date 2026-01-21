class employee{
	int DeptID;
	int EmpID;
	int compensation=600;
	void leavecalculate(int days)
	{
		System.out.println("Compensation: "+compensation*days);
	}
}
class manager extends employee{
	manager()
	{
		compensation=800;
		System.out.println("Category Manager: ");
	}
	
}
class worker extends employee{
	worker()
	{
		compensation=500;
		System.out.println("Category Worker: ");
	}
	
}
class leavesystem{
	public static void main(String[] args)
	{
		System.out.println("Default Compensation: ");
		int days=Integer.parseInt(args[0]);
		employee e1=new employee();
		e1.leavecalculate(days);
		manager e2=new manager();
		e2.leavecalculate(days);
		worker e3=new worker();
		e3.leavecalculate(days);
	}
}
