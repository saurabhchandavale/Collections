package com.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SlidingWindow {
	
	public int[] nextGreaterElement(int arr[]) {
		int result[] = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i = arr.length-1; i >= 0; i--) {
			if(!stack.isEmpty()) {
				while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				result[i] = arr.length;
			}else {
				result[i] = stack.peek();
			}
			stack.push(i);
		}
		return result;
		
	}
	
	public List<Integer> slidingWindw(int arr[], int k){
		int[] newArr = nextGreaterElement(arr);
		List<Integer> l = new ArrayList<Integer>();
		for(int i = 0; i <= arr.length-k; i++) {
			int j = i;
			while(newArr[j] < i+k) {
				j = newArr[j];
			}
			l.add(arr[j]);
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlidingWindow s = new SlidingWindow();
		int arr[] = {44,77,33,44,88,11,100};
		List<Integer> slidingWindw = s.slidingWindw(arr, 3);
		for(int i : slidingWindw) {
			System.out.print(i + " ");
		}

	}

}
