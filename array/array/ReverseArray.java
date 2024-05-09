package com.array.array;

public class ReverseArray {

	public static void reverseArray(int arr[]) {
		int a[] = new int[arr.length];
		int indx = 0;
		for(int i = arr.length-1; i>= 0; i--) {
			a[indx] = arr[i];
			indx++;
		}
		
		for(int i = 0; i<= a.length-1; i++) {
			System.out.print(a[i]);
		}

		
	}
	
	public static void reverseArray(int arr[],int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[] = {1,2,3,4,5};
		//reverseArray(ary);
		reverseArray(ary,0,ary.length-1);
		
	}

}
