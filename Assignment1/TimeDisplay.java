class time{
	int hour;
	int minute;
	int second;
	time(int hourin){
		hour=hourin;
		System.out.println("Time: "+hour+" Hours");
	}
	time(int hourin, int minutein){
		hour=hourin;
		minute=minutein;
		System.out.println("Time: "+hour+":"+minute);
	}
	time(int hourin, int minutein, int secondin){
		hour=hourin;
		minute=minutein;
		second=secondin;
		System.out.println("Time: "+hour+":"+minute+":"+second);
	}
}
class TimeDisplay{
	public static void main(String[] args){
		time ob1= new time(12);
		time ob2= new time(12,5);
		time ob3= new time(11,45,52);
	}
}