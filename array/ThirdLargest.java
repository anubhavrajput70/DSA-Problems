package array;

public class ThirdLargest {
	public static void main(String[] args)
	{
	int a[]= {1,6,7,2,3};
	System.out.println("index of thirdlargest element is = "+thirdLargest(a));
}
static int thirdLargest(int a[])
{
	int largest=0;
	int secondLargest=0;
	int thirdLargest=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>a[largest])
			largest=i;
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>a[secondLargest]&&a[i]<a[largest])
			secondLargest=i;
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>a[thirdLargest]&&a[i]<a[secondLargest])
			thirdLargest=i;
	}
	
	return thirdLargest;
}
}
