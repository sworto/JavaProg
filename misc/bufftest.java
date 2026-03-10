import java.io.*;
class bufftest{
	public static void main (String[] args){
		int x; //For the below reason i am using int datatype for the receiving variable.

		//Buffered Input Stream Returns the datatype INT. It is so that the EOF can be represented as -1.
		BufferedInputStream b1= new BufferedInputStream(System.in,400);
			for(int i=0;i<10;i++){
				try{
					x= b1.read();
					System.out.print(x+" ");
				}
				catch(IOException e){

				}
			}	
	}
}