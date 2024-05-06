package com.linkedlist;

public class MergeSortedLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			super();
			this.data = data;
		}

	}

	public void print(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
	}

	public ListNode merge(ListNode l, ListNode a) {
		if (l.data < a.data) {
			head = l;
			l = l.next;
		} else {
			head = a;
			a = a.next;
		}
		ListNode tail = head;
		while (a != null && l != null) {
			if (l.data < a.data) {
				tail.next = l;
				l = l.next;
			} else {
				tail.next = a;
				a = a.next;
			}
			tail = tail.next;
		}
		if (a == null) {
			tail.next = l;
		} else {
			tail.next = a;
		}
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedLinkedList l = new MergeSortedLinkedList();
		l.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(6);
		ListNode fourth = new ListNode(7);
		ListNode fifth = new ListNode(8);

		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		MergeSortedLinkedList a = new MergeSortedLinkedList();
		a.head = new ListNode(2);
		ListNode s = new ListNode(5);

		a.head.next = s;
		l.print(l.head);
		System.out.println();
		a.print(a.head);
		System.out.println();
		ListNode merge = l.merge(l.head, a.head);
		l.print(merge);

	}

}
