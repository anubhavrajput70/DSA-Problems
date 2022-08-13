package stack;

import java.util.ArrayDeque;

public class NextSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,9,2,5,1,8,3};
		nextSmaller(arr);
		
	}
	public static void nextSmaller(int[] arr)
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
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+" ");
	}
		
	}
	

}
