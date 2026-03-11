import java.io.*;
import java.util.Scanner;
class filerw{
	public static void main(String[] args) throws IOException{
		int itx=0;
		Scanner rd= new Scanner(System.in);
		String ipfile= new String(args[0]);
		FileReader r1= new FileReader(ipfile);
		System.out.println("Enter O/P filename: ");
		String s1= new String(rd.nextLine());
		FileWriter w1= new FileWriter(s1+".txt");
		while(itx!=-1){
			itx=r1.read();
			w1.write((char)itx);
		}
		r1.close();
		w1.close();
		return;
	}
}