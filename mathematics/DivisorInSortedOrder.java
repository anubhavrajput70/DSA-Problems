package mathematics;

public class DivisorInSortedOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=30;
		divisor(n);
	}
	public static void divisor(int n)
	{
		int i=1;
		for(;i*i<=n;i++)
		{
			if(n%i==0)
				System.out.println(i);
		}
		i--;
		for(;i>=1;i--)
		{
			if(n%i==0)
			{
				if(n%i!=i)
					System.out.println(n/i);
			}
		}
	}
	
}
