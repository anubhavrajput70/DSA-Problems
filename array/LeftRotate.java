package array;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,8,6,2,4,5,8,3,7};
		rotate(a);
	}
	static void rotate(int[] a)
	{
		int ro=a[0];
		for(int i=0;i<a.length-1;i++)
			a[i]=a[i+1];
		a[a.length-1]=ro;
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
