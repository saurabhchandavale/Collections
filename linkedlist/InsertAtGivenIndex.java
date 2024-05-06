package com.linkedlist;

public class InsertAtGivenIndex {

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
		System.out.print("null");
	}

	public void insertAtGivenPoint(int value, int index) {
		ListNode newNode = new ListNode(value);
		if (index == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			ListNode previous = head;
			int count = 1;
			while (count < index - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = newNode;
			newNode.next = current;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertAtGivenIndex l = new InsertAtGivenIndex();
		l.head = new ListNode(0);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(2);
		ListNode fourth = new ListNode(3);

		l.head.next = second;
		second.next = third;
		third.next = fourth;
		l.print();
		System.out.println();
		l.insertAtGivenPoint(5, 1);
		l.print();
		System.out.println();
		l.insertAtGivenPoint(10, 2);
		l.print();
		System.out.println();
		l.insertAtGivenPoint(10, 7);
		l.print();
		System.out.println();
		l.insertAtGivenPoint(100, 6);
		l.print();

	}

}
