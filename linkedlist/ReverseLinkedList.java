package com.linkedlist;


public class ReverseLinkedList {
	
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			super();
			this.data = data;
		}
		
		
	}
	
	public void print(ListNode revresed) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public void print1(ListNode revresed) {
		ListNode current = revresed;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public ListNode reverse(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		if(head== null) {
			return head;
		}
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList l = new ReverseLinkedList();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		l.print(l.head);
		System.out.println();
		ListNode revresed = l.reverse(l.head);
		l.print1(revresed);

	}

}
