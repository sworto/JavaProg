import java.util.Random;
class matrixdiasum{
	public static void main(String[] args){
		int[][] matrix=new int[3][3];
		Random rand= new Random();
		System.out.println("Matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=rand.nextInt(10);
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		int leftsum=0;
		int rightsum=0;
		for(int i=0;i<3;i++)
		{
			leftsum=leftsum+matrix[i][i];
			rightsum=rightsum+matrix[i][3-i-1];
		}
		System.out.println("Left Sum: "+leftsum);
		System.out.println("Right Sum: "+rightsum);
	}
}
