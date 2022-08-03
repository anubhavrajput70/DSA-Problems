package array;
//write a program to replace every element with the greatest element on its right side
public class RightGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,5,8,9,6,8,5,7,4,6};
		greatest(a);

	}
	static void greatest(int[] a)
	{	
		

		int currMax=a[a.length-1];
		a[a.length-1]=0;
		
		for(int i=a.length-2;i>=0;i--)
		{
			int temp=a[i];
			a[i]=currMax;
			if(currMax<temp)
				currMax=temp;
			
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
