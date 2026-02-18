import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the first number");
		int p= read.nextInt();
		System.out.println("Enter the second number");
		int q= read.nextInt();	
		try{
			System.out.println("The division of "+p+" and "+q+" is: "+p/q);
		}
		catch(ArithmeticException e){
			System.out.println("Careful!! Division by 0 is not permissible!!");
			Calculator.main(null);

		}
	}
}