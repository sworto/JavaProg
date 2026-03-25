class twodbox{
	int length;
	int breadth;
	int pps;
	twodbox(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		pps=40;
	}
	void pricecalculate(){
		System.out.println("Price: "+length*breadth*pps);
	}
}
class threedbox extends twodbox{
	int height;
	threedbox(int length,int breadth,int height){
		super(length,breadth);
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		pps=60;
	}
	void pricecalculate(){
		System.out.println("Price: "+length*breadth*height*pps);
	}
}
class boxcalc{
	public static void main(String[] args){
		twodbox b1=new twodbox(4,5);
		threedbox b2= new threedbox(3,4,5);
		b1.pricecalculate();
		b2.pricecalculate();
		return;
	}
}