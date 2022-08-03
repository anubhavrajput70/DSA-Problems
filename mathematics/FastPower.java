package mathematics;

public class FastPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=4;
		System.out.println(fastPower(a,b));
	}
	static int fastPower(int a, int b)
	{
		if(b==0)
			return 1;
		int halfRes=fastPower(a,b/2);
		int fullRes=halfRes*halfRes;
		if(b%2!=0)
			fullRes=fullRes*a;
		return fullRes;
	}

}
