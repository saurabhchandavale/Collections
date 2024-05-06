package com.linkedlist;


public class DeleteLast {
	
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
	
	public ListNode deletLast() {
		if(head == null || head.next == null) {
			return head;
		}else {
			ListNode currNode = head;
			ListNode previous = null;
			while(currNode.next != null) {
				previous = currNode;
				currNode = currNode.next;
			}
			previous.next = null;
			currNode = null;
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteLast l = new DeleteLast();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		l.print();
		System.out.println();
		l.deletLast();
		l.print();
	}

}
