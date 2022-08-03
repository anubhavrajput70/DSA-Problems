package recursion;

public class RatInAMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,1,0,1},
					{1,1,1,1},
					{1,0,1,0},
					{1,1,1,1}};
		boolean[][] vis=new boolean[a.length][a.length];
		System.out.println(rat(a,vis,0,0));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(vis[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean rat(int[][] a,boolean vis[][],int i,int j)
	{
		int n=a.length;
		//base condition
		if(i>=n||j>=n||vis[i][j]||a[i][j]==0)
			return false;
		//base condition for successfully reached
		if(i==n-1&&j==n-1)
			return true;
		//mark this cell as visited
		vis[i][j]=true;
		//check if a path is possible from down
		if(rat(a,vis,i+1,j))
			return true;
		//check if a path is possible from right
		if(rat(a,vis,i,j+1))
			return true;
		//mark this cell as unvisited and backtrack
		vis[i][j]=false;
				//backtrack
		return false;
	}
}
