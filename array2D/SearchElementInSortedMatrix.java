package array2D;
//search element in row wise and column wise sorted array
public class SearchElementInSortedMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,4,5,7},{2,5,6,9},{6,10,11,13}};
		int key= 11;
		if(search(a,key))
			System.out.println("true");
		else
			System.out.println("false");
	}
	static boolean search(int[][] a,int key)
	{
		int i=0;
		int j=a.length-1;
		while(i<a.length&&j>=0)
		{
			if(a[i][j]==key)
				return true;
			else if(key>a[i][j])
				i++;
			else
				j--;
		}
		return false;
		}
	
}
