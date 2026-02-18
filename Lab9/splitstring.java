class splitstring{
	public static void main(String[] args){
		String ip=new String(args[0]);
		String[] split=ip.split(" ");
		StringBuffer s= new StringBuffer(ip.length());
		for(int i=0;i<split.length;i++){
			s.append(split[i]);
		}
		System.out.println("String without space: "+s);
	}
}