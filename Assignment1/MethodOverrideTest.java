abstract class shape{
	void CalculateArea(){
		System.out.println("Area Calculation.");
	}
}
class triangle extends shape{
	void CalculateArea(int base, int height){
		System.out.println("Area triangle: "+0.5*base*height);
	}
}
class rectangle extends shape{
	void CalculateArea(int length, int breadth){
		System.out.println("Area rectangle: "+length*breadth);
	}
}
class MethodOverrideTest{
	public static void main(String[] args){
		triangle t1=new triangle();
		rectangle r1= new rectangle();
		t1.CalculateArea(5,6);
		r1.CalculateArea(6,7);
	}
}