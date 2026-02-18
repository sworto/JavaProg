class Palindromecheck{
	public static void main(String[] args){
		String ip= new String(args[0]);
		int len= ip.length();
		for(int i=0;i<len;i++){
			if(ip.charAt(i)!=ip.charAt(len-i-1)){
				System.out.println("Not a Palindrome");
				return;
			}
		}
		System.out.println("Palindrome Confirmed!!");
	}
}