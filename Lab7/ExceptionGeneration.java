class ExceptionGeneration{
	public static void main(String[] args){
		String newString = null;
		try{
			newString.length();
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer Exception");
		}
	}
}