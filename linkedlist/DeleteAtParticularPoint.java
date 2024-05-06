package com.linkedlist;


public class DeleteAtParticularPoint {
	
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
	
	public void deleteParticularNode(int index) {
		if(index  == 1)
		{
			head = head.next;
			return;
		}else {
			ListNode previous = head;
			int count = 1;
			while(count < index - 1) {
				previous = previous.next;
				count++;
			}
			ListNode currentNode = previous.next;
			previous.next = currentNode.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteAtParticularPoint l = new DeleteAtParticularPoint();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		l.print();
		System.out.println();
		l.deleteParticularNode(4);
		l.print();

	}

}
