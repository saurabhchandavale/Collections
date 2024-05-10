package com.search;

public class InsertionSort {
	
	public int[] sort(int arr[]) {
		for(int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>temp) {
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertionSort s = new InsertionSort();
		int arr[] = {1,4,8,5,3,2,0,3};
		int[] sort1 = s.sort(arr);
		for(int b : sort1) {
			System.out.print(b + " ");
		}
	}

}
