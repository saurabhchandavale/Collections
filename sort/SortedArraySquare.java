package com.search;

public class SortedArraySquare {
	
	public int[] soretedSquare(int arr[]) {
		int n = arr.length;
		int[] result = new int[n];
		int i = 0;
		int j = n-1;
		
		for(int k = n-1; k >= 0; k--) {
			if(Math.abs(arr[i]) > Math.abs(arr[j])) {
				result[k] = arr[i] * arr[i];
				i++;
			}else {
				result[k] = arr[j] * arr[j];
				j--;
			}
		}
		return result;
	}
	//Only applicable for sorted array   like 4 2 0 1 3 6

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedArraySquare s = new SortedArraySquare();
		int arr[] = {5,-4,1,3,6};
		int[] soretedSquare = s.soretedSquare(arr);
		for(int n : soretedSquare) {
			System.out.print(n);
		}
	}

}
