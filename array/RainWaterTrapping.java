package array;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,0,2,1,0,1,3,2,1,2,1};
		RainWaterTrapping rwt=new RainWaterTrapping();
		rwt.trapping(a);
	}
	void trapping(int[] a)
	{
		int[] ll=leftLargest(a);
		int[] rl=rightLargest(a);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int min=Math.min(ll[i],rl[i]);
			sum=sum+(min-a[i]);
		}
		System.out.println(sum);
		for(int i=0;i<ll.length;i++)
			System.out.print(ll[i]+" ");
		System.out.println();
		for(int i=0;i<ll.length;i++)
			System.out.print(rl[i]+" ");
	}
	int[] leftLargest(int[] a)
	{
		int largest=Integer.MIN_VALUE;
		int[] b=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
				b[j]=largest;
			}
			b[j]=largest;
			j++;
		}
		return b;
	}
	int[] rightLargest(int[] a)
	{
		int largest=Integer.MIN_VALUE;
		int[] b=new int[a.length];
		int j=a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]>largest)
			{
				largest=a[i];
				b[j]=largest;
			}
			b[j]=largest;
			j--;
		}
		return b;
	}
	
	
}
