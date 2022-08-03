package string;
//two strings with same types of characters, repeating same no. of times
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="god";
		String s2="dog";
		System.out.println(anagram(s1,s2));
	}
	static boolean anagram(String s1,String s2 )
	{
		int a[] =new int[256];
		for(int i=0;i<s1.length();i++)
			a[s1.charAt(i)]++;
		for(int i=0;i<s2.length();i++)
			a[s2.charAt(i)]--;
		for(int e:a)
			if(e!=0)
				return false;
		
		return true;
	}
}
