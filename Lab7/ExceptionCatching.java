class ExceptionCatching{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int[] s1= new int[n];
		try{
		s1[n]=0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bounds exception: "+e);
		}
	}
}
