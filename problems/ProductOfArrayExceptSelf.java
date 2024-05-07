package com.problems;

public class ProductOfArrayExceptSelf {
	
	public int[] product(int arr[]) {
		int temp = 1;
		int result[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			result[i] = temp;
			temp = temp * arr[i];
		}
		temp = 1;
		for(int i = arr.length - 1; i >= 0; i--) {
			result[i] = result[i] * temp;
			temp = arr[i] * temp;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
		int arr[] = {5,1,2,3,4};
		int[] product = p.product(arr);
		for(int c : product) {
			System.out.print(c + " ");
		}

	}

}
