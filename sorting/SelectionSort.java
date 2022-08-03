package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,1,9,3,4,2,1,5};
		selection(a);
	}
	public static void selection(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			if(min!=i)
			{
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
