package array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,1,9,3,5,4,8,7,2,1,3};
		System.out.println(subsequenceLength(a));
	}
	static int subsequenceLength(int a[])
	{
		
		int ans=0;
		Set<Integer> set=new HashSet<>();
		for(int e:a)
			set.add(e);
		for(int i=0;i<a.length;i++)
		{
			int len=1;
			if(!set.contains(a[i]-1))
			{
				
				while(set.contains(++a[i]))
					len++;
				ans=Math.max(ans,len);
			}
			
		}
		return ans;
	}
}
