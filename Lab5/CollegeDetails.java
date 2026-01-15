class Student{
	int RollNo;
	String Course;
	void register(int RollNoin, String Coursein)
	{
		RollNo=RollNoin;
		Course=Coursein;
		System.out.println("Course registration for "+RollNo+" successful for course "+Course);
	}
}
class Kittian extends Student{
	void hostelrequest()
	{
		System.out.println("Hostel accomodation request placed for "+RollNo+" Belonging to: "+Course);
	}
}
class CollegeDetails{
	public static void main(String[] args){
		int roll=Integer.parseInt(args[0]);
		Kittian s1=new Kittian();
		s1.register(roll,args[1]);
		s1.hostelrequest();
	}
}