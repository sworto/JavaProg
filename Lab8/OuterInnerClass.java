class Person{
	int AdhaarNo;
	int Age;
	Person(int AdhaarNo, int Age){
		this.AdhaarNo=AdhaarNo;
		this.Age=Age;
	}
	class Address{
		int HouseNo;
		String City;
		String State;
		Address(int HouseNo, String City, String State){
			this.HouseNo=HouseNo;
			this.City=City;
			this.State=new String(State);
		}
	}
}
class OuterInnerClass{
	public static void main(String[] args){
		Person p1=new Person(12345,21);
		Person.Address a1= p1.new Address(139,"Ahmedabad","Gujarat");
		System.out.println("AdharNo: "+p1.AdhaarNo);
		System.out.println("Address: "+a1.HouseNo+", "+a1.City+", "+a1.State);
	}
}
