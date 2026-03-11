class checkusg{
	public static void main(String[] args){
		Runtime runtime= Runtime.getRuntime();
		long max=(runtime.maxMemory()/1024)/1024;
		long total= (runtime.totalMemory()/1024)/1024;
		long avl= (runtime.freeMemory()/1024)/1024;
		System.out.println("Vars: "+ max +" "+total+" "+avl);
		return;
	}
}