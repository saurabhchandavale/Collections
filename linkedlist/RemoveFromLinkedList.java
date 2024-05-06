package com.linkedlist;


public class RemoveFromLinkedList {
	
	private  ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			super();
			this.data = data;
		}
		
		
	}
	public void print(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public ListNode removeNode(int value) {
		ListNode current = head;
		ListNode temp = null;
		if(head == null) {
			return null;
		}
		while(current != null && current.data < value) {
			temp = current;
			current = current.next;
		}
		temp.next = current.next;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveFromLinkedList l = new RemoveFromLinkedList();

		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(7);
		ListNode fifth = new ListNode(8);
		
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		l.print(l.head);
		System.out.println();
		l.removeNode(8);
		l.print(l.head);
		System.out.println();

	}

}
