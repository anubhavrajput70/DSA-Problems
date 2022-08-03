package mathematics;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=24,b=36;
		System.out.println("LCM of the no. is = "+lcm(a,b));
	}
	public static int lcm(int a, int b)
	{
		int lcm=(a*b)/gcd(a,b);
		return lcm;
	}
	public static int gcd(int a, int b)
	{
		if(a==b)
			return a;
		if(a<b) return gcd(b,a);
		return gcd(a-b,b);
	}
}
