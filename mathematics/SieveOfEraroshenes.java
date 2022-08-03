package mathematics;

import java.util.Arrays;

public class SieveOfEraroshenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=150;
		sieve(n);
	}
	public static void sieve(int n)
	{
		boolean isPrime[] =new boolean[n+1];
		Arrays.fill(isPrime,true);
		for(int i=2;i*i<=n;i++)
		{
			if(isPrime[i])
			{
				for(int j=i*i;j<=n;j+=i)
					isPrime[j]=false;
			}
		}
		for(int i=2;i<=n;i++)
			if(isPrime[i])
				System.out.println(i);
	}
	
}
