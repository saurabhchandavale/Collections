package com.array;

public class MinumFromArray {

	public static int minArray(int arr[]) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,-5,7,8,0,-1};
		System.out.println(minArray(arr));
	}

}
