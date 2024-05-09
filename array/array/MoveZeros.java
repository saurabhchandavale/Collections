package com.array;

public class MoveZeros {
	
	public static void moveZeros(int arr[]) {
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]!= 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,3,0,4,0,5,6,-5};
		moveZeros(arr);
	}

}
