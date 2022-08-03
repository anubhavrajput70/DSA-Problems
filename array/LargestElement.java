package array;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,1,7,2,3};
		System.out.println("index of largest element is = "+largest(a));
	}
	static int largest(int a[])
	{
		int largest=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[largest]<a[i])
				largest=i;
		}
		return largest;
	}
}
