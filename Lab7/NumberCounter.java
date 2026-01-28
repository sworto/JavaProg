class NegativeNumberException extends Exception{
	NegativeNumberException(){
		System.out.println("Negative Number!!");
	}
}
class processInput{
	processInput(int n){
	try{
		if(n<0){
		throw new NegativeNumberException();
		}
		int count=0;
		while(n>0){
		n=n/10;
		count++;
		}
		System.out.println("Total Digits: "+count);
	}
	catch(NegativeNumberException e){
		System.out.println("Exiting");
	}
	}
}
class NumberCounter{
	public static void main(String[] args){
		int n= Integer.parseInt(args[0]);
		processInput p1 = new processInput(n);

	}
}
