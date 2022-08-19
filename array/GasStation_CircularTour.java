package array;

public class GasStation_CircularTour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] petrol= {6,10,2,3,20};
		int[] distance= {5,8,4,5,6};
		System.out.println(petrol[circularTour(petrol,distance)]);
		
	}
	public static int circularTour(int[] p,int dis[])
	{
		int n=p.length;
		int start=0,deficient=0, curr=0;
		for(int i=0;i<n;i++)
		{
			curr+=p[i]-dis[i];
			if(curr<0)
			{
				deficient+=curr;
				curr=0;
				start=i+1;
			}
		}
		if(curr+deficient>=0)
		{
			return start;
		}
		return -1;
	}

}
