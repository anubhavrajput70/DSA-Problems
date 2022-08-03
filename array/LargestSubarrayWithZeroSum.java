package array;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,5,-3,-4,3,4,1};
		largest(a);
	}
	static void largest(int a[])
	{
		int len=0;
		int i=0,j=0,sum=0;
		Map<Integer,Integer> map=new HashMap<>();
		map.put(sum,-1);
		for(int k=0;k<a.length;k++)
		{
			sum=sum+a[k];
			if(map.containsKey(sum))
			{
				int prev=map.get(sum);
				if(len<(k-prev))
				{
					len=(k-prev);
					//System.out.println(prev+"* ");
					i=prev+1;
					j=k;
				}	
			}
			else
			{
				map.put(sum,k);
			}	
		}
		System.out.println(len);
		for(int k=i;k<=j;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
