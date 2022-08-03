package recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(factorial(n));
	}
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
}
