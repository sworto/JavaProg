import java.io.*;
class wordcount{
	public static void main(String[] args) throws IOException{
		int itx=0;
		String filename=new String(args[0]);
		//Using FileReader:
		FileReader b1= new FileReader(filename);
		int count=0;
		while(itx!=-1){
			itx=b1.read();
			//To check spaces(ASCII 32) or EOF(INT -1)
			if((char)itx==32 || itx==-1){
				count++;
			}
		}
		System.out.println("TotalWord: "+count);
		b1.close();
		return;
	}
}