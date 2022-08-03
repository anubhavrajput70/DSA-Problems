package array2D;

public class RotateMatrix90DegreeClockwise {

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
		rotate90Degree(a);
	}
	static void rotate90Degree(int[][] a)
	{
		int n=a.length;
	 transpose(a);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				int swap=a[i][j];
				a[i][j]=a[i][n-j-1];
				a[i][n-j-1]=swap;
			}
		}
		System.out.println("matrix after rotation is = ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[][] transpose(int[][] a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int swap=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=swap;
			}
		}
		
	return a;
	}

}
