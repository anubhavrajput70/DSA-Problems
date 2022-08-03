package array;

public class TrappingRainWaterO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,2,8,7,9,8,9,2};
		System.out.println(trapping(a));
	}
	static int trapping(int[] a)
	{
		int ans=0;
		int left=0;
		int right=a.length-1;
		int leftMax=0,rightMax=0;
		
		while(left<right)
		{
			if(a[left]<=a[right])
			{
				if(leftMax<a[left])
				{
					leftMax=a[left];
				}
				else
					ans+=(leftMax-a[left]);
				left++;
			}
			else
			{
				if(rightMax<a[right])
					rightMax=a[right];
				else
					ans+=(rightMax-a[right]);
				right--;
			}
		}
		return ans;
		
	}

}
