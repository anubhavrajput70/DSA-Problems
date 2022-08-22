package string;

public class ReverseWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am your boss";
		System.out.println(reverseWords(s));
	}
	  public static String reverseWords(String s) {
	       String st=s.trim();
	        int l=0;
	        int r=0;
	        String regex="\s+";
	        char ch[]=st.toCharArray();
	        for(int i=0;i<ch.length;i++)
	        {
	         if(ch[i]==' ')
	         {
	             r=i-1;
	             reverse(ch,l,r);
	             l=i+1;
	         }
	        }
	        reverse(ch,l,ch.length-1);
	        reverse(ch,0,ch.length-1);
	       String str=new String(ch);
	        String str2=str.replaceAll(regex," ");
	        return str2;
	    }
	    public void reverse(char ch[],int l, int r)
	    {
	        while(l<r)
	        {
	            char c=ch[l];
	            ch[l]=ch[r];
	            ch[r]=c;
	            l++;
	            r--;
	        }
	    }

}
