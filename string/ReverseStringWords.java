package string;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am the boss here";
		System.out.println(reverseWords(s));
	}
	   public static String reverseWords(String s) {
	        int l=0;
	        int r=0;
	        char ch[]=s.toCharArray();
	        for(int i=0;i<ch.length;i++)
	        {
	            
	            if(ch[i]==' '||i==ch.length-1)
	            {
	                if(i==ch.length-1)
	                    r=i;
	                else
	                  r=i-1;
	                while(l<r)
	                {
	                    char temp=ch[l];
	                    ch[l]=ch[r];
	                    ch[r]=temp;
	                    l++;
	                    r--;
	                }
	                l=i+1;
	            }
	        }
	        return new String(ch);
	    }
}
