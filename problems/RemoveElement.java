package com.problems;

public class RemoveElement {
	
	public int removeElement(int arr[], int val) {
		int i = 0;
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] != val) {
			arr[i] = arr[j];
			i++;
			}
		}
		for(int k = 0; k < i; k++) {
			System.out.println(arr[k]);
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement r = new RemoveElement();
		int arr[] = {0,1,5,2,3,2,4};
		int removeElement = r.removeElement(arr, 2);
		System.out.println(removeElement);
	}

}
