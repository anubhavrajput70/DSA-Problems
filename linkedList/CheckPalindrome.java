package linkedList;

import linkedList.ReverseInGroup.Node;

public class CheckPalindrome {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(2);
		head.next.next.next.next.next = new Node(1);
		if(palindrome(head))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
	static boolean palindrome(Node head)
	{	
		Node mid=middle(head);
		Node right=reverse(mid.next);
		Node left=head;
		while(right!=null)
		{
			if(left.data!=right.data)
				return false;
			left=left.next;
			right=right.next;
		}
		return true;
				
	}
	static Node middle(Node head)
	{
		Node fast=head;
		Node slow=head;
		while(fast!=null&&fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	static Node reverse(Node head)
	{
		Node curr=head,prev=null;
		while(curr!=null)
		{
			Node temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}

}
