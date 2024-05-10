package com.search;

public class SelectionSort {
	
	public int[] sort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			int min = i;
			
			for(int j = i+1; j < n; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	
	public static void main(String args[]) {
		SelectionSort s = new SelectionSort();
		int arr[] = {1,4,8,5,3,2,0,3,0};
		int[] sort1 = s.sort(arr);
		for(int b : sort1) {
			System.out.print(b + " ");
		}
	}

}
