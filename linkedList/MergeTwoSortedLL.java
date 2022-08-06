package linkedList;
public class MergeTwoSortedLL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = new Node(2);
		head1.next = new Node(3);
		head1.next.next = new Node(6);
		head1.next.next.next = new Node(7);
		Node head2 = new Node(1);
		head2.next = new Node(4);
		head2.next.next = new Node(8);
		head2.next.next.next = new Node(9);
		head2.next.next.next.next = new Node(10);
		Node head=mergeTwoSorted(head1,head2);
		printList(head);
	}
	public static Node mergeTwoSorted(Node head1,Node head2)
	{
		Node head=null,tail=null;
		Node a=head1,b=head2;
		if(head1==null) return b;
		if(head2==null) return a;
		
		if(a.data<=b.data)
		{
		head=a;
		tail=a;
		a=a.next;
		}
		else
		{
			head=b;
			tail=b;
			b=b.next;
		}
		while(a!=null&&b!=null)
		{
			if(a.data<=b.data)
			{
				tail.next=a;
				tail=a;
				a=a.next;
			}
			else
			{
				tail.next=b;
				tail=b;
				b=b.next;
			}
		}
		if(a==null) tail.next=b;
		if(b==null) tail.next=a;
				
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
	static class Node
	{
		int data;
		Node next;
		public Node (int data)
		{
		this.data=data;
		this.next=null;
		}
	}
}
