package com.problems;

public class RotateArray {
	
	public int[] rotate(int arr[], int k) {
		int n = arr.length;
		//reverse(arr,0,n-1);
		reverse(arr, 0, k-1);
		//reverse(arr, k, n-1);
		return arr;
	}
	
	public void reverse(int[] arr, int start, int end) {
		while(start < end) {
		int temp = arr[start];
		arr[start]= arr[end];
		arr[end] = temp;
		start++;
		end--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray a = new RotateArray();
		int arr[] = {1,2,3,4,5,6,7};
		int[] rotate = a.rotate(arr, 3);
		for(int r : rotate) {
			System.out.print(r);
		}
	}

}
