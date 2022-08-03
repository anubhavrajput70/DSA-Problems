package recursion;
//generate all subsets of a string
public class SubsetOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String s="aaa";
		int i=0;
		String cur="";
		subset(s,i,cur);
	}
	static void subset(String s,int i,String cur)
	{
		if(i==s.length())
		{
			System.out.println(cur);
		   return;
		}
		subset(s,i+1,cur);
		subset(s,i+1,cur+s.charAt(i));
		
			 
	}
}
