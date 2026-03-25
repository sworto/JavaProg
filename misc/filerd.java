import java.io.*;
class filerd{
	public static void main(String[] args) throws IOException{
		String ipdoc= new String(args[0]);
		String opdoc=new String(args[1]);
		Input f1= new InputStream(ipdoc);
		OutputStream f2= new OutputStream(opdoc);
		int x=0;
		while(x!=-1){
			x=f1.read();
			if(x==-1){
				break;
			}
			f2.write((char)x);
		}
		f1.close();
		f2.close();
		return;
	}
}