package string;

public class PatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabdabdacdab";
		String p="bda";
		matching(s,p);
	}
	public static void matching(String s,String p)
	{
		int n=s.length();
		int m=p.length();
		for(int i=0;i<n-m;i++)
		{
			int j=0;
			for(;j<m;j++)
			{
				if(s.charAt(i+j)!=p.charAt(j))
					break;
			}
			if(j==m)
				System.out.println("pattern found at "+i+" index");
		}
	}
}
