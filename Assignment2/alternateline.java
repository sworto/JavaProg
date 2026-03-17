import java.io.*;
class alternateline{
	public static void main(String[] args) throws IOException{
		FileReader r1= new FileReader(args[0]);
		FileWriter w1= new FileWriter(args[1]);
		int itx=0;
		int count=0;
		while(itx!=-1){
			itx=r1.read();
			//The count%2 determines if the next sequence till \n will be written or not (all the characters will be read)
			if((char)itx=='\n'){
				count++;
			}
			if(count%2==0){
				w1.write((char)itx);
			}
		}
		r1.close();
		w1.close();
		return;
	}
}