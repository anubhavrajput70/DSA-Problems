package array;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,6,7,2,3};
		System.out.println("index of largest element is = "+secondLargest(a));
	}
	static int secondLargest(int a[])
	{
		int largest=0;
		int secondLargest=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[largest]<a[i])
			{
				secondLargest=largest;
				largest=i;
			}else if(a[largest]>a[i])
			{
				if(a[secondLargest]<a[i]||secondLargest==-1)
				secondLargest=i;
			}

		}
		return secondLargest;
	}
}
