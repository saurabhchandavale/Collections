package com.linkedlist;


public class SearchInLinkedList {
	
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

	public boolean search(int value) {
		ListNode current = head;
		while(current !=null) {
			if(current.data == value) {
				return true;
			}
			current = current.next;
		}
		return false;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchInLinkedList l = new SearchInLinkedList();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		l.print();
		System.out.println();
		System.out.println(l.search(5));

	}

}
