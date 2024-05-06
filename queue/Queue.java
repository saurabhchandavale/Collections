package com.queue;

public class Queue {
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public Queue() {
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	
	private static class ListNode {
		private int data;
		private ListNode next;
		public ListNode(int data) {
			super();
			this.data = data;
		}
		
		
	}

	
	public int length() {
		return length;
		
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void enequeue(int data) {
		ListNode temp = new ListNode(data);
		if(isEmpty()) {
			front = temp;
		}else {
			rear.next = temp;
			
		}
		
		rear = temp;
		length++;
		
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
			int result = front.data;
			front = front.next;
			if(front==null) {
				rear = front;
				
			}
			length--;
			
		
		return result;

	}
	
	public void print() {
		ListNode current = front;
		while(current!=null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	
	public static void main(String args[]) {
		Queue  q = new Queue();
		q.enequeue(1);
		q.enequeue(2);
		q.enequeue(3);
		q.print();

		int a = q.dequeue();
		System.out.println(a);
		System.out.println(q.dequeue());


		q.print();
		
	}
}
