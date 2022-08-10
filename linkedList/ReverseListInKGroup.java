package linkedList;

public class ReverseListInKGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head.next.next.next.next.next.next.next = new Node(8);
		int k=3;
		head=reverseGroup(head,k);
		printList(head);
	}
	public static Node reverseGroup(Node head,int k)
	{ 
        if(head.next==null)
            return head;
        Node prevFirst=null,curr=head,newHead=null;
        int n=0;
        while(curr!=null)
        {
            curr=curr.next;
            n++;
        }
        curr=head;
        while(curr!=null)
        { 
            Node prev=null,first=curr;
            int count=1;
            if(n>=k)
            {
                while(curr!=null&&count<=k)
                {
                    Node temp=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=temp;
                    count++; 
                 
                }
                if(newHead==null)
                 {
                newHead=prev;
                 }
                 else
                 {
                 prevFirst.next=prev;
                 }
            prevFirst=first;
             n=n-k;
            }
            else
            {
               prevFirst.next=curr;
                prevFirst=prevFirst.next;
                curr=curr.next;      
            }
        }
        return newHead;
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
