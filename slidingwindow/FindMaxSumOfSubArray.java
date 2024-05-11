package com.slidingwindow;

public class FindMaxSumOfSubArray {

	public int maxSum(int[] arr, int k) {
		int maxSum = 0;
		for(int i = 0; i <= arr.length-k; i++) {
			int m = k + i;
			int n = i;
			int sum = 0;
			while(n < m) {
				
				sum = sum + arr[n];
				maxSum = Math.max(maxSum, sum);
				n++;
			}
		}
		return maxSum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMaxSumOfSubArray f = new FindMaxSumOfSubArray();
		int arr[] = {1,2,3,4,5};
		int maxSum = f.maxSum(arr, 3);
		System.out.println(maxSum);
	}

}
