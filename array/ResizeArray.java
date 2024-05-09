package com.array;

public class ResizeArray {
	
	public static int[] resizeArray(int arr[], int n) {
		int temp[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
			
		}
		//arr = temp;
		return temp;
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		System.out.println(arr.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,3,0};
		System.out.println(arr.length);
		arr = resizeArray(arr, arr.length*2);
		 
		printArray(arr);
	}

}
