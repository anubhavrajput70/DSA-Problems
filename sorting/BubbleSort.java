package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,6,1,2,5,7,4,7,9};
		bubble(a);
				
		}
	public static void bubble(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			boolean flag=true;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=false;
				}
			}
			if(flag)
				break;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}
	}
	
