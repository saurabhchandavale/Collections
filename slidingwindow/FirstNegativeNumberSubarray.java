package com.slidingwindow;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberSubarray {
	
	public void printNegativeNumber(int arr[], int k) {
		for(int i = 0; i < arr.length-k;i++) {
			for(int j = i; j < i+k; j++) {
				if(arr[j] < 0) {
					System.out.println(arr[j]);
					break;
				}
			}
		}
	}
	
	public int[] firstNegative(int arr[], int k) {
		int i = 0, j = 0;
		int result[] = new int[arr.length-k+1];
		int indx = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		while(j < arr.length) {
			if(arr[j] < 0) {
				q.add(arr[j]);
			}
			if(j-i==k) {
				if(q.size()==0)
					result[indx++] = 0;
				else {
					result[indx++] = q.peek();
				
				if(arr[i] == q.peek()) {
					q.poll();
				}
				}
				i++;
			}
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNegativeNumberSubarray f = new FirstNegativeNumberSubarray();
		int arr[] = {1,-1,-2,1,-1,1,1,1};
		//f.printNegativeNumber(arr, 2);
		int[] firstNegative = f.firstNegative(arr, 2);
		for(int a: firstNegative) {
			System.out.println(a);
		}
	}

}
