package stack;
//index based
import java.util.ArrayDeque;

public class PreviousSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,9,2,5,1,8,3};
		previousSmaller(arr);
		
	}
	public static void previousSmaller(int[] arr)
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
	for(int i=0;i<b.length;i++)
	{
		System.out.print(b[i]+" ");
	}
		
	}

}
