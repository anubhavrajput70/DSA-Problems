package array;

public class ArrayReverse {
public static void main(String[] args)
{
	int a[]= {1,6,7,2,3};
	reverse(a);
}
static void reverse(int[] a)
{
	int[] b=new int[a.length];
	int j=0;
	for(int i=a.length-1;i>=0;i--)
	{
	b[j]=a[i];
	j++;
	}
	System.out.println("reversed array is ");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(b[i]+" ");
	}
}
}
