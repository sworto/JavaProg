class CountWord{
	public static void main(String[] args){
		String ip= new String(args[0]);
		String[] nosofwords= ip.split(" ");
		int wordcount=nosofwords.length;
		int vowelcount=0;
		int consonantcount=0;
		int stringlength=ip.length();
		String iplower=ip.toLowerCase();
		for(int i=0;i<iplower.length();i++){
			int currentchar=iplower.charAt(i);
			if(currentchar=='a'||currentchar=='e'||currentchar=='i'||currentchar=='o'||currentchar=='u'){
				vowelcount++;
			}
			else if(currentchar==' '){

			}
			else consonantcount++;
		}
		System.out.println("String: "+ip);
		System.out.println("Length: "+stringlength);
		System.out.println("Wordcount: "+wordcount);
		System.out.println("Vowelcount: "+vowelcount);
		System.out.println("Consonantcount: "+consonantcount);
	}
}