package com.linkedlist;

import java.util.LinkedList;

public class SinglyLinkedlist {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			super();
			this.data = data;
		}

	}

	public void printNodes() {
		ListNode current = head;
		if (head == null) {
			System.out.println(0);
			return;
		}
		while (current != null) {
			System.out.print(current.data + "--> ");
			current = current.next;

		}
		System.out.print("null" + " ");
	}

	public int length() {
		int count = 0;
		ListNode current = head;
		if (head == null) {
			return 0;
		}
		while (current != null) {
			current = current.next;
			count++;

		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedlist s = new SinglyLinkedlist();
		s.head = new ListNode(10);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(20);
		ListNode fourth = new ListNode(25);

		s.head.next = second;
		second.next = third;
		third.next = fourth;
		s.printNodes();
		int l = s.length();
		System.out.println("\n" + "Length is " + l);

	}

}
