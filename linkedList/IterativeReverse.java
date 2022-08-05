package linkedList;


class Node
{
	int data;
	Node next;
	public Node (int data)
	{
	this.data=data;
	this.next=null;
	}
}
public class IterativeReverse {
	
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
		
	

	 head=	reverse(head);
	printList(head);
		
	}
	public static Node reverse(Node head)
	{
		Node prev=null,curr=head;
		while(curr!=null)
		{
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
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
