package array2D;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			 transpose(a);
	}
	static void transpose(int[][] a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int swap=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=swap;
			}
		}System.out.println("transpose of matrix is = ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
