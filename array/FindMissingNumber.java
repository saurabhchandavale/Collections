package com.array;

public class FindMissingNumber {
	
	public static int missingNumber(int arr[]) {
		int n = arr.length + 1;
		int sum = n*(n+1)/2;
		for (int i : arr) {
			sum = sum - i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,3,7};
		int num = missingNumber(arr);
		System.out.println(num);
	}

}
