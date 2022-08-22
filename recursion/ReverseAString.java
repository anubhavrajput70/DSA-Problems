package recursion;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anubhav";
		rev(s);
	}
	static void rev(String s)
	{
		char ch[]=s.toCharArray();
		int l=0;
		int r=ch.length-1;
		reverse(ch,l,r);
	}
	static void reverse(char ch[],int l,int r)
	{
		if(l>=r)
		{
			String s=new String(ch);
			System.out.println(s);
			return;
		}
		char temp=ch[l];
		ch[l]=ch[r];
		ch[r]=temp;
		reverse(ch,l+1,r-1);
			
	}

}
