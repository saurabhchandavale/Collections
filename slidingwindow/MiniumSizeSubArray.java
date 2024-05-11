package com.slidingwindow;

public class MiniumSizeSubArray {
	
	public int miniumSubarrayBrut(int arr[], int k) {
		int minLength = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if(sum >= k) {
				minLength = Math.min(minLength, (j-i+1));
				break;
				}
			}
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}
	
	public int miniumSubarrayOpt(int arr[], int k) {
		int minlength = Integer.MAX_VALUE;
		int sum = 0;
		int start = 0;
		for(int end = 0; end < arr.length; end++) {
			sum = sum + arr[end];
			
			while(sum >= k && start <= end) {
				minlength = Math.min(minlength, (end-start+1));
				sum = sum - arr[start++];
			}
		}
		return minlength == Integer.MAX_VALUE ? 0: minlength;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniumSizeSubArray m = new MiniumSizeSubArray();
		int arr[] = {7,2,1,1,6,5};
		int miniumSubarrayBrut = m.miniumSubarrayBrut(arr, 11);
		System.out.println(miniumSubarrayBrut);
		
		int miniumSubarrayOpt = m.miniumSubarrayOpt(arr, 11);
		System.out.println(miniumSubarrayOpt);
	}

}
