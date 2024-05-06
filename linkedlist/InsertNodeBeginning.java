package com.linkedlist;

public class InsertNodeBeginning {

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

	public void addAtBeginning(ListNode newNode) {
		newNode.next = head;
		head = newNode;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertNodeBeginning l = new InsertNodeBeginning();
		l.head = new ListNode(10);
		ListNode second = new ListNode(100);
		ListNode third = new ListNode(1000);
		ListNode fourth = new ListNode(10000);

		l.head.next = second;
		second.next = third;
		third.next = fourth;
		l.print();
		ListNode newNode = new ListNode(1);
		ListNode newNode1 = new ListNode(-1);

		System.out.println();
		l.addAtBeginning(newNode);
		l.print();
		System.out.println();
		l.addAtBeginning(newNode1);
		l.print();
	}

}
