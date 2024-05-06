package com.linkedlist;

public class InsertNodeAtLast {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			super();
			this.data = data;
		}

	}

	public void print() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public void insertAtLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertNodeAtLast l = new InsertNodeAtLast();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);

		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		l.print();
		System.out.println();
		l.insertAtLast(6);
		l.print();
		System.out.println();
		l.insertAtLast(7);
		l.print();

	}

}
