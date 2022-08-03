package string;

public class ReverseTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am the boss here";
		System.out.println(wordReverse(s));
	}
	static String wordReverse(String s)
	{
		char[] c=s.toCharArray();
		int start=0;
		int end=0;
		for(;end<s.length();end++)
		{
			if(c[end]==' ')
			{
				reverse(c,start,end-1);
				start=end+1;
			}
		}
		reverse(c,start,end-1);
		reverse(c,0,s.length()-1);
		return new String(c);
	}
	static void reverse(char[] s,int i,int j)
	{
		while(i<j)
		{
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
		
	}
}
