package com.linkedlist;


public class RemoveDuplicates {
	
	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			super();
			this.data = data;
		}
		
		
	}
	
	public void print() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public void removeDuplicates() {
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates l = new RemoveDuplicates();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(2);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);

		
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		l.print();
		System.out.println();
		l.removeDuplicates();
		l.print();

	}

}
