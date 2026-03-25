class time{
	int hour;
	int min;
	time(int hour, int min){
		this.hour=hour;
		this.min=min;
		System.out.println("Time: "+this.hour+":"+this.min);
	}
	void add(time t1){
		this.hour=t1.hour+this.hour;
		this.min=t1.min+this.min;
		if(this.min>=60){
			this.hour++;
			this.min=60-this.min;
		}
		System.out.println("Time after addition: "+this.hour+":"+this.min);
		return;
	}
	void subtract(time t1){
		this.hour=this.hour-t1.hour;
		this.min=this.min-t1.min;
		if(this.min<=-60){
			this.hour--;
			this.min=0-this.min;
			this.min=60-this.min;
		}
		System.out.println("Time after subtraction: "+this.hour+":"+this.min);
		return;
	}
}
class timecalc{
	public static void main(String[] args){
		time t1= new time(2,30);
		time t2= new time(1,15);
		t1.add(t2);
		t1.subtract(t2);
		return;
	}
}