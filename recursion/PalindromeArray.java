package recursion;

public class PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,4,2};
		int start=0;
		int end=a.length-1;
		if(palindrome(a,start,end)==1)
			System.out.println("palindrome");
		else
			System.out.println("not a plindrome");
	}
	static int palindrome(int[] a,int start,int end)
	{
		if(start>=end)
			return 1;
		if(a[start]==a[end])
			return palindrome(a,start+1,end-1);
		else
			return 0;
	}
}
