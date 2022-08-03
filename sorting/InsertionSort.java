package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,611,2,3,4,5,2,3,3,4,2,4};
		insertion(a);
	}
	public static void insertion(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i;
			for(;j>0;j--)
			{
				if(a[j-1]>temp)
					a[j]=a[j-1];
				else
					break;
			}
			a[j]=temp;
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
