package array;

public class Leaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,7,6,1,4,3};
		leader(a);
	}
	static void leader(int a[])
	{
		int largest=Integer.MIN_VALUE;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]>largest)
			{
				largest=a[i];
				System.out.print(a[i]+" ");
			}
		}
	}
}

