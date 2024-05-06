package com.linkedlist;


public class FindNthNodeFromLast {
	
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
	
	public ListNode findNthNode(int value) {
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while(count < value) {
			refPtr = refPtr.next;
			count++;
		}
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNthNodeFromLast l = new FindNthNodeFromLast();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);

		
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		l.print(l.head);
		System.out.println();
		System.out.println(l.findNthNode(4).data);

	}

}
