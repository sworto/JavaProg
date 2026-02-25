class togglecase{
	public static void main(String[] args){
		String ip=new String(args[0]);
		StringBuffer op= new StringBuffer(ip.length());
		int len=ip.length();
		char a;
		for(int i=0;i<len;i++){
			a=ip.charAt(i);
			if(Character.isLowerCase(a)==true){
				op.append(Character.toUpperCase(a)+"");
			}
			else{
				op.append(Character.toLowerCase(a)+"");
			}
		}
		System.out.println("ReversedCase: "+op);
		return;
	}
}
