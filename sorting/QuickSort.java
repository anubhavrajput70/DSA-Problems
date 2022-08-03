package sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,3,9,1,4,2,7};
		int l=0,h=a.length-1;
		quickSort(a,l,h);		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		}
	public static void quickSort(int a[],int l,int h)
	{
		if(l<h) {
			int pivot=partition(a,l,h);
			quickSort(a,l,pivot-1);
			quickSort(a,pivot+1,h);
		}
			
	}
	public static int partition(int a[],int l, int h)
	{
		int i=l;
		int j=h;
		int pivot=a[l];
		while(i<j)
		{
			while(a[i]<=pivot&&i<j)
				i++;
			while(a[j]>pivot)
				j--;
			if(i<j)
				swap(a,i,j);
		}
		swap(a,l,j);
		return j;
	}
	public static void swap(int[] a,int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
