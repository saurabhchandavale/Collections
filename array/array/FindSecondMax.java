package com.array;

public class FindSecondMax {
	
	public static int secondMax(int arr[]) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			if(arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,-5};
		System.out.println(secondMax(arr));
	}

}
