package recursion;
//find the sum of squares of n natural numbers
public class SumOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(squareSum(n));
	}
	static int squareSum(int n)
	{
		if(n==1)
			return 1;
		return (n*n)+squareSum(n-1);
	}
}
