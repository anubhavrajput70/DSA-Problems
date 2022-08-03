package sorting;

public class IntersectionOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,6,6,8,8};
		int b[]= {1,1,2,3,6,6,9};
		intersection(a,b);
		
	}
	public static void intersection(int[] a,int[] b)
	{
		int i=0,j=0;
		while(i<a.length&&j<b.length)
		{
			if(i>0&&a[i]==a[i-1])
			{
				i++;
				continue;
			}
			if(a[i]==a[j])
			{
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			else if(a[i]<a[j])
				i++;
			else if(a[i]>a[j])
				j++;
		}
	}

}
