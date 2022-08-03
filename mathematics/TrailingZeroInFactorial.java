package mathematics;

public class TrailingZeroInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25;
		System.out.println(trailingZeros(n));
	}
	public static int trailingZeros(int n)
	{
		int res=0;
		while(n>0)
		{
			res+=n/5;
			n=n/5;
		}
		return res;
	}

}
