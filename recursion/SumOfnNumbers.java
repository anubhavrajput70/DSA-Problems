package recursion;

public class SumOfnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(sum(n));
	}
	static int sum(int n)
	{
		if(n==0)
			return 0;
		return n+sum(n-1);
	}

}
