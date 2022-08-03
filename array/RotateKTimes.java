package array;

public class RotateKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,8,6,2,4,5,8,3,7};
		int k=4;
		rotateKTimes(a,k);
	}
	static void rotateKTimes(int[] a,int k)
	{
		for(int i=0;i<=k;i++)
			a=rotateLeft(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	static int[] rotateLeft(int a[])
	{
		int ro=a[0];
		for(int i=0;i<a.length-1;i++)
			a[i]=a[i+1];
		a[a.length-1]=ro;
		return a;
			
	}
}
