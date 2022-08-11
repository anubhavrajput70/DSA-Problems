package stack;

public class ImplementTwoStackWithOneArray {
int a[];
int top1,top2;
public ImplementTwoStackWithOneArray(int capacity)
{
	a=new int [capacity];
	top1=-1;
	top2=capacity;
}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ImplementTwoStackWithOneArray obj=new ImplementTwoStackWithOneArray(5);
		obj.push1(10);
		obj.push1(20);
		obj.push1(30);
		
		obj.push2(40);
		obj.push2(60);
		System.out.println(obj.pop1());
		System.out.println(obj.pop1());
		System.out.println(obj.pop2());
		System.out.println(obj.pop2());
		
	}
	void push1(int data) throws Exception
	{
		if(top1+1<top2)
		{
			top1++;
			a[top1]=data;
		}
		else
			throw new Exception("stack array is full");
	}
	void push2(int data) throws Exception
	{
		if(top1+1<top2)
		{
			top2--;
			a[top2]=data;
		}
		else
			throw new Exception("stack array is full");
	}
	int pop1() throws Exception
	{
		
		if(top1>-1)
		{
			int res=a[top1];
			top1--;
			return res;
		}
		else
			throw new Exception("stack array is empty");
	}
	int pop2() throws Exception
	{
		
		if(top2<a.length)
		{
			int res=a[top2];
			top2++;
			return res;
		}
		else
			throw new Exception("stack array is empty");
	}

}
