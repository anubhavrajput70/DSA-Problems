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
public class ReverseInGroup {

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
		int k=3;
	 head=reverseGroup(head,k);
	 printList(head);
	}
	public static Node reverseGroup(Node head,int k)
	{
		Node prevFirst=null,curr=head,newHead=null;
		while(curr!=null)
		{
		int count=0;
		Node prev=null,first=curr;
		while(curr!=null&&count<k)
		{
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
			count++;
		}
		if(newHead==null)
			newHead=prev;
		else
		prevFirst.next=prev;
		prevFirst=first;
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
