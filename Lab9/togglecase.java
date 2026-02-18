class togglecase{
	public static void main(String[] args){
		String ip=new String(args[0]);
		if(ip.equals(ip.toLowerCase())){
			System.out.println("UpperCase: "+ip.toUpperCase());
		}
		else if(ip.equals(ip.toUpperCase())){
			System.out.println("Lowercase: "+ip.toLowerCase());
		}

		else{
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
			System.out.println("MixedCase: "+op);
		}
	}
}