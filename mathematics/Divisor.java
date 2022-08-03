package mathematics;
//print all divisors of a number
public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=30;
		divisor(n);
	}
	public static void divisor(int n)
	{
		for(int i=1;i*i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				if(n/i!=i)
					System.out.println(n/i);
			}
		}
	}

}
