class duplicateremoveviaSB{
	public static void main(String[] args){
		String ip= new String(args[0]);
		int len=ip.length();
		int flag;
		StringBuffer op= new StringBuffer(len);
		for(int i=0;i<len;i++){
			if(op.indexOf(ip.charAt(i)+"")==-1){
				op.append(ip.charAt(i));
			}
		}
		System.out.println("Final String: "+op);
	}
}
