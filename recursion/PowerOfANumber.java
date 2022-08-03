package recursion;

public class PowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		System.out.println(power(a,b));
	}
	static int power(int a,int b)
	{
		if(b==0)
			return 1;
		return a*power(a,b-1);
	}

}
