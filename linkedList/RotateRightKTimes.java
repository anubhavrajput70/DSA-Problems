package linkedList;
/*We can optimize the solution by finding (n-k)th element which is going 
to be the starting element. First we find the length of the list as n and 
make the list as a circular linked list. So to perform rotation on linked
list, we first find (n-k-1)th element whose next element would be (n-k). 
Now set (n-k) as result(or head) and (n-k-1)'s next as null to break the 
loop of circular linked list.*/

public class RotateRightKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(10);
		head.next.next.next.next = new Node(4);
		head.next.next.next.next.next = new Node(5);
		head.next.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next.next = new Node(7);
		int k=4;
		head=rotate(head,k);
		printList(head);
	}
	public static Node rotate(Node head,int k)
	{
		//for empty or list with 1 node return them as such         
        if(head == null || head.next == null)
        	return head;
      //length starts from 1 to include last element
		 Node curr=head;
	        int count=1;
	        while(curr.next!=null)
	        {
	            count++;
	            curr=curr.next;
	        }
	        //Set the last node to head to form circular linked list
	        curr.next=head;
	        curr=head;
	        // Rotating n*a times would just give the same linked list so remove them
	        
	        k=k%count;
	    //  Since we rotate right we have to find the (n-k)th element which is the head      
	        
	        for(int i=0;i<count-k-1;i++)
	        {
	            curr=curr.next;
	        }
	      //Break the cycle by keeping head as (n-k) and setting (n-k-1)th element as tail
	        
	        head=curr.next;
	        curr.next=null;
	        return head;
		
	}
	public static void printList(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
}
