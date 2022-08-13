package stack;

import java.util.ArrayDeque;

public class MaxAreaInHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,3,9,2,5,1,8,3};
		maxAreaInHistogram(a);
	}
	public static void maxAreaInHistogram(int[] a)
	{
		int ps[]=previousSmaller(a);
		int ns[]=nextSmaller(a);
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			int width=ns[i]-ps[i]-1;
			int currArea=width*a[i];
			max=Math.max(max,currArea);
			
		}
		System.out.println(max);
		
	}
	public static int[] previousSmaller(int[] arr)
	{
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		int[] b=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			while(!ad.isEmpty()&&arr[ad.peek()]>=arr[i])
				ad.pop();
			if(ad.isEmpty())
				b[i]=-1;
			else
				b[i]=ad.peek();
			ad.push(i);
		}
	return b;
		
	}
	public static int[] nextSmaller(int[] arr)
	{
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		int[] b=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			while(!ad.isEmpty()&&arr[ad.peek()]>=arr[i])
				ad.pop();
			if(ad.isEmpty())
				b[i]=arr.length;
			else
				b[i]=ad.peek();
			ad.push(i);
		}
	return b;
		
	}

}
