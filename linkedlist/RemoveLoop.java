package com.linkedlist;


public class RemoveLoop {
	
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
	
	public void detectLoop() {
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr) {
				 removeLoop(slowPtr);
				 return;
			}
			
		}
		
	}
	
	public void removeLoop(ListNode slowPtr) {
		ListNode temp = head;
		while(temp.next != slowPtr.next) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveLoop l = new RemoveLoop();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(7);
		ListNode fifth = new ListNode(8);
		
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = second;
		//l.print(l.head);
		System.out.println();
		l.detectLoop();
		l.print();
		

	}

}
