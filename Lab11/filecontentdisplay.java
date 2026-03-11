import java.io.*;
class filecontentdisplay{
	public static void main(String[] args) throws IOException{
		int itx=0;
		String filename=new String(args[0]);
		//Using FileReader:
		FileReader b1= new FileReader(filename);
		while(itx!=-1){
			itx=b1.read();
			System.out.print((char)itx);
		}
		b1.close();
		return;
	}
}