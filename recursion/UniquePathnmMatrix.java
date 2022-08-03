package recursion;
//find the number of unique path in an n*m matrix
public class UniquePathnmMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,m=5;
		System.out.println(path(n,m));
	}
static int path(int n,int m)
{
	if(n==1||m==1)
		return 1;
	return path(n,m-1)+path(n-1,m);
}
}
