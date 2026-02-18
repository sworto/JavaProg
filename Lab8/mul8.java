import java.util.Scanner;
class mul8{
	public static void main(String[] args){
		Scanner read= new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=read.nextInt();
		num=num<<3;
		System.out.println("Multiplied Value: "+num);
	}
}
