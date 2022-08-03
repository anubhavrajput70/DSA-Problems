package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,3,9,1,4,2,7};
		int l=0;
		int h=a.length-1;
		sort(a,l,h);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void sort(int[] a,int l,int h)
	{
		if(l<h)
		{
		int mid=(l+h)/2;
		sort(a,l,mid);
		sort(a,mid+1,h);
		merge(a,l,mid,h);
		}
		
	}
	public static void merge(int[] a,int l,int mid,int h)
	{
		int b[]=new int[a.length];
		int i=l;
		int j=mid+1;
		int k=l;
		while(i<=mid&&j<=h)
		{
			if(a[i]<a[j])
			{
				b[k]=a[i];
				i++;
			}
			else
			{
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=h)
			{
				b[k]=a[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				b[k]=a[i];
				i++;
				k++;
			}
		}
		for(i=l;i<=h;i++)
			a[i]=b[i];
			
	}
}
