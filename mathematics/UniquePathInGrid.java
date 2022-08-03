package mathematics;

public class UniquePathInGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,m=3;
		System.out.println(path(n,m));
		
	}
	public static int path(int n,int m)
	{
		int res=1;
		for(int i=1;i<n;i++)
		{
			res=(res*(m+i))/i;
		}
		return res;
	}

}
