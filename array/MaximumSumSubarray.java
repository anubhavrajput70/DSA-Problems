package array;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a={6,-7,4,-2,1,5,-4};
		 subArray(a);
	}
	static void subArray(int[] a)
	{
		int curMax=0;
		int max=0;
		int[] b=new int[a.length];
		int j=0;
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			curMax+=a[i];
			b[j]=a[i];
			j++;
			if(curMax<0)
			{
				j=0;
				curMax=0;
			}
			if(max<curMax)
			{
				max=curMax;
				k=i;
			}
		}
		System.out.println(max);
		for(int i=0;i<k-1;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}
