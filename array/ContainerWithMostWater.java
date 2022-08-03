package array;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,8,6,2,4,5,8,3,7};
		container(a);
	}

	static void container(int a[])
	{
		int maxArea=0;
		int l=0;
		int r=a.length-1;
		while(l<r)
		{
			int height=Math.min(a[l],a[r]);
			int distance=r-l;
			int area=height*distance;
			maxArea=Math.max(maxArea,area);
			if(a[l]<a[r])
				l++;
			else
				r--;
		}
		System.out.println(maxArea);
	}
}
