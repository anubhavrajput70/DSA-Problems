package array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,2,3,4,4,7,7,7,9};
		duplicate(a);
	}

	static void duplicate(int[] a)
	{
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=a[j])
			{
				j++;
				a[j]=a[i];
			}
		}
		
		for(int i=0;i<j+1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
