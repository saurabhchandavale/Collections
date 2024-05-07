package com.problems;

import java.util.Arrays;

public class ThreeSum {
	
	public void threeSum(int arr[], int target) {
		Arrays.sort(arr);
		for(int i = 0; i < arr.length - 2; i++) {
			int j = i+1;
			int k = arr.length - 1;
			while(j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if(sum == target) {
					System.out.print("{ " + arr[i] + " " + arr[j] + " " + arr[k] + " } ");
					j++;
					k--;
				}else if(sum < target) {
					j++;
					
				}else {
					k--;
				}
			}

			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeSum t = new ThreeSum();
		int arr[] = {0,1,2,3,4,7,3};
		t.threeSum(arr, 6);
	}

}
