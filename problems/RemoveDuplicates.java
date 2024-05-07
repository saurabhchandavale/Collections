package com.problems;

public class RemoveDuplicates {
	
	public int removeDuplicates(int arr[]) {
		int i = 1;
		for(int j = 1; j < arr.length; j++) {
			if(arr[j] != arr[j-1]) {
				arr[i] = arr[j];
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates r = new RemoveDuplicates();
		int arr[] = {0,0,1,1,2,2,3,3};
		int removeDuplicates = r.removeDuplicates(arr);
		System.out.println(removeDuplicates);
		for(int i = 0; i < removeDuplicates; i++) {
			System.out.print(arr[i]);
		}

	}

}
