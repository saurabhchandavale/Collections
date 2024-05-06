package com.linkedlist;

public class CircularLinkedList {
	
	private ListNode last;
	private int length;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			super();
			this.data = data;
		}
		
		
	}
	
	

	public CircularLinkedList() {
		super();
		this.last = null;
		this.length = 0;
	}
	
	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}
	
	
	public void createList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(10);
		ListNode third = new ListNode(15);
		ListNode fourth = new ListNode(16);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		last = fourth;

	}
	
	public void print() {
		if(last == null) {
			return ;
		}
		ListNode first = last.next;
		//ListNode f = first;
		while(first != last) {
			System.out.print(first.data + " -> ");
			first = first.next;
		}
		System.out.print(last.data);
		System.out.println();
		
	}
	
	public void insertAtEnd() {
		ListNode temp = new ListNode(100);
		if(last == null) {
			temp = last;
			last.next = temp;
			
		}else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		
		length++;
		
	}
	
	public void insertAtStart() {
		ListNode temp = new ListNode(0);
		if(last == null) {
			last = temp;
		}else {
			temp.next = last.next;
		}
		last.next = temp;
	}
	
	public void removeFirst() {
		if(isEmpty()) {
			return;
		}
		ListNode temp = last.next;
		
		if(temp == last) {
			 last = null;
		}else {
			last.next = temp.next;
		}
		temp.next = null;
		length--;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularLinkedList c = new CircularLinkedList();
		c.createList();
		c.insertAtEnd();
		c.print();
		c.insertAtStart();
		c.print();
		c.removeFirst();
		c.print();

	}

}
