package com.linkedlist;


public class DetectLoopInLinkedList {
	
	private ListNode head;
	
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
	
	public ListNode detectLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			fastPtr =fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr) {
				//return true;
				return getStartingNode(slowPtr);
			}
					
		}
		return null;
	}
	
	public ListNode getStartingNode(ListNode slowPtr) {
		ListNode temp = head;
		while(temp != slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
					
		}
		return temp;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectLoopInLinkedList l = new DetectLoopInLinkedList();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(7);
		ListNode fifth = new ListNode(8);
		
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		//fifth.next = second;
		//l.print(l.head);
		System.out.println(l.detectLoop().data);

	}

}
