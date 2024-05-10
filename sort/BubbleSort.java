package com.search;

public class BubbleSort {
	
	public int[] sort(int arr[]) {
		for(int i = 0; i < arr.length-1; i++) {
			boolean isSwapeed = false;
			for(int j = 0; j < arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSwapeed = true;
				}
			}
			if(isSwapeed == false) break;
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BubbleSort b = new BubbleSort();
		int arr[] = {1,4,8,3,2,0,3};
		int[] sort = b.sort(arr);
		for(int s : sort) {
			System.out.print(s + " ");
		}
	}

}
