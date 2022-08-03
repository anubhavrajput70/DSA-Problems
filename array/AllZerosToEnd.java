package array;

public class AllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,0,1,3,0,0,5};
		zeros(a);
	}
	static void zeros(int[] a)
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[j]=a[i];
				j++;
			}
		}
		for(;j<a.length;j++)
		{
			a[j]=0;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
