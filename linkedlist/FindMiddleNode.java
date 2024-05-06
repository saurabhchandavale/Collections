package com.linkedlist;

public class FindMiddleNode {
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

	//Find Middle node for even LinkedList
	public ListNode findMiddleEven(){
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
					
		}
		return slowPtr;
		
	}
	
	public ListNode findMiddleOdd() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
					
		}
		return slowPtr;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMiddleNode l = new FindMiddleNode();
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
		System.out.println(l.findMiddleEven().data);
		//System.out.println(l.findMiddleOdd().data);
	}

}
