package mathematics;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=24,b=36;
		System.out.println("gcd of a and b is = "+gcdMoreEfficient(a,b));
	}
	public static int gcd(int a, int b)
	{
		if(a==b)
			return a;
		if(a<b) return gcd(b,a);
		return gcd(a-b,b);
	}
	public static int gcdEfficient(int a, int b)
	{
		if(b==0)
			return a;
		if(a<b) return gcdEfficient(b,a);
		return gcdEfficient(a%b,b);
	}
	public static int gcdMoreEfficient(int a, int b)
	{
		if(a%b==0)
			return b;
		if(a<b) return gcdMoreEfficient(b,a);
		return gcdMoreEfficient(a%b,b);
	}
	
}
