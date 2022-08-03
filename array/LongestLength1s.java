package array;

public class LongestLength1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,1,0,0,1,0,1,1,1,1,0,1};
		longest(a);
	}
	static void longest(int[] a)
	{
		int maxLength=0;
		int cur=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==1)
			{
				cur++;
			}
			else
			{
				maxLength=Math.max(cur,maxLength);
				cur=0;
			}
		}
		System.out.println(maxLength);
	}

}
