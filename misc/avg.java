import java.util.Scanner;
class avg{
	public static void main(String[] args){
		Scanner s1= new Scanner(System.in);
		int countneg=0;
		int countpos=0;
		int i=0;
		int[] array;
		while(1){
			array[i]=s1.nextInt();
			if(array[i]>0){
				countpos++;
			}
			else if(array[i]<0){
				countneg++;
			}
			else{
				break;
			}
			i++;
		}
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum=sum+array[i];
		}
		System.out.println("Average FP: "+((float)sum/array.length()));
	}
}