package com.linkedlist;


public class AddLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			super();
			this.data = data;
		}

	}

	public void print(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public ListNode addNodes(ListNode a, ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		while(a != null || b != null) {
			int x = (a!=null) ? a.data : 0;
			int y = (b!=null) ? b.data : 0;
			int sum = carry + x + y;
			carry = sum/10;
			tail.next = new ListNode(sum%10);
			tail = tail.next;
			if(a != null) a = a.next;
			if(b != null) b = b.next;
			
		}
		if(carry > 0) {
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddLinkedList a = new AddLinkedList();		
		a.head = new ListNode(7);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(9);
		ListNode fourth = new ListNode(7);
		ListNode fifth = new ListNode(8);

		a.head.next = second;
		second.next = third;
		
		AddLinkedList b = new AddLinkedList();
		b.head = new ListNode(5);
		ListNode s = new ListNode(6);

		b.head.next = s;
		a.print(a.head);
		System.out.println();
		b.print(b.head);
		System.out.println();
		ListNode addNodes = a.addNodes(a.head, b.head);
		a.print(addNodes);

	}

}
