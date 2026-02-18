class duplicateremove{
	public static void main(String[] args){
		String ip= new String(args[0]);
		int len=ip.length();
		int flag;
		String op= new String();
		for(int i=0;i<len;i++){
			if(op.indexOf(ip.charAt(i)+"")==-1){
				op= new String(op+ip.charAt(i));	
			}
		}
		System.out.println("Final String: "+op);
	}
}