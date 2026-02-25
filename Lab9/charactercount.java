import java.util.Scanner;
class charactercount{
	public static void main(String[] args){
		Scanner read= new Scanner(System.in);
		System.out.print("Enter the String: ");
		String ip= new String(read.nextLine());
		System.out.print("Enter the character: ");
		String ipchar= new String(read.nextLine());
		char[] inputchar= ipchar.toCharArray();
		char a= inputchar[0];
		int count=0;
		if(ip.indexOf(a)==-1){
			System.out.println("Character count: 0");
		}
		else{
			for(int i=0;i<ip.length();i++){
				if(ip.charAt(i)==a){
					count++;
				}
			}
			System.out.println("Character count: "+count);
		}
		return;
    }
}
